package sky.redis.core;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Pipeline;
import redis.connect.tool.RedisClientFatory;
import redis.key.demo.ConstString;
import redis.tool.CreatLog;
import redis.tool.Util;
import sky.redis.data.model.RCounter;
import sky.redis.data.model.RFilter;
import sky.redis.exception.CountedNotExistsException;
import sky.redis.exception.CounterNotExistsException;
import sky.redis.exception.DistinctFilterNotExistsException;
import sky.redis.exception.FilterNotExistsException;
import sky.redis.exception.MainFilterNotExistsException;

public class RedisInsertor {

	private RCounter counter;
	private long value = 100 * 100l;
	private static Object lock;

	public RedisInsertor() {
		if (RedisInsertor.lock == null)
			lock = new Object();
	}

	public void initCounter(String counterName)
			throws CounterNotExistsException {
		Jedis redis = null;
		try {
			redis = RedisClientFatory.getRedisClient();
			if (redis != null) {
				String counterInfo = redis.get(counterName);
				if (counterInfo == null)
					throw new CounterNotExistsException(counterName
							+ " is not exists.");
				counter = new ObjectMapper().readValue(counterInfo,
						RCounter.class);
			}
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			RedisClientFatory.returnResource(redis);
		}
		// System.out.println(counter.getTitle());
	}

	public void setValue(String counted, String vlaue)
			throws CountedNotExistsException {
		if (!counter.isCounted(counted)) {
			throw new CountedNotExistsException(counted
					+ " is not counted for " + counter.getName());
		}
		double v = Util.strToDouble(vlaue);
		value = (long) (v * 100 * 100);
	}

	private boolean contains(String str, List<String> sign) {
		if (sign == null | sign.size() == 0)
			return true;
		for (String string : sign) {
			if (str.contains(string))
				return true;
		}
		return false;
	}

	public List<String> insert(Map<String, List<String>> insertMap)
			throws FilterNotExistsException, DistinctFilterNotExistsException,
			MainFilterNotExistsException {
		List<String> keys = null;
		Jedis redis = null;
		try {
			redis = RedisClientFatory.getRedisClient();
			// Pipeline p = redis.pipelined();
			if (redis != null) {
				confirme(insertMap);
				setMainInfo(insertMap);

				if (isNew(insertMap)) {

					keys = new ArrayList<String>();

					setExcludedInfo(insertMap);
					setInfo(insertMap);
					insertGroupInfo(insertMap);

					List<String> excluded = KeyFactory.getKeys(
							ConstString.excluded, counter);
					List<String> keyList = KeyFactory.getKeys(
							ConstString.title, counter);

					for (String key : keyList) {
						if (contains(key, excluded)) {
							String rkey = KeyFactory.toRedisKey(key);
							long rValue = redis.incrBy(rkey, value);
							keys.add(key);
							if (value == rValue) {
								if (key.contains(counter.getTtlSign())) {
									redis.expire(rkey, counter.getTtl());
								}
							}
						}
					}
				}
				// p.sync();
			}
			return keys;
		} finally {
			RedisClientFatory.returnResource(redis);
		}
	}

	private void insertGroupInfo(Map<String, List<String>> insertMap) {
		Jedis redis = null;
		try {
			redis = RedisClientFatory.getRedisClient();
			if (redis != null) {
				Pipeline p = redis.pipelined();

				List<String> groupKeys = KeyFactory.getKeys(ConstString.group,
						counter);
				for (String key : groupKeys) {
					String[] temp = key.split(ConstString.SPLITER);
					String name = temp[temp.length - 1];
					List<String> list = insertMap.get(name);
					if (list != null)
						for (String string : list) {
							if (key.contains(ConstString.SPLITER
									+ counter.getTtlSign())) {
								key = KeyFactory.toRedisKey(key);
								p.sadd(key, string);
								p.expire(key, counter.getTtl());
							} else {
								key = KeyFactory.toRedisKey(key);
								p.sadd(key, string);
							}
						}
				}
				p.sync();
			}
		} finally {
			RedisClientFatory.returnResource(redis);
		}
	}

	private void confirme(Map<String, List<String>> insertMap)
			throws FilterNotExistsException, DistinctFilterNotExistsException,
			MainFilterNotExistsException {
		for (String key : insertMap.keySet()) {
			if (!counter.contains(new RFilter(key)))
				throw new FilterNotExistsException(key
						+ " is not exists in counter:" + counter.getName());
		}
		for (RFilter rf : counter.getDisTitle()) {
			if (insertMap.get(rf.getName()) == null)
				throw new DistinctFilterNotExistsException(
						"insert failed cased by no distinct filter "
								+ rf.getName());
		}
		for (RFilter rf : counter.getMainTitle()) {
			if (insertMap.get(rf.getName()) == null)
				throw new MainFilterNotExistsException(
						"insert failed cased by no main filter " + rf.getName());
		}
	}

	private boolean isNew(Map<String, List<String>> insertMap) {
		boolean flag = true;
		List<RFilter> disFilter = counter.getDisTitle();
		List<String> disKeys = KeyFactory
				.getKeys(ConstString.distinct, counter);
		Jedis redis = null;
		try {
			redis = RedisClientFatory.getRedisClient();
			if (redis != null) {
				for (RFilter rf : disFilter) {
					for (String key : disKeys) {
						String rkey = KeyFactory.toRedisKey(key);
						List<String> list = insertMap.get(rf.getName());
						for (String string : list) {
							long result = redis.sadd(rkey, string);
							if (result > 0) {
								if (key.contains(counter.getTtlSign())) {
									redis.expire(rkey, counter.getTtl());
								}
							} else {
								flag = false;
								CreatLog.setRedisProxyInsertInfo(string
										+ " is exists now");
							}
						}
					}
				}
			}
			return flag;
		} finally {
			RedisClientFatory.returnResource(redis);
		}
	}

	private void setInfo(Map<String, List<String>> insertMap) {
		for (Entry<String, List<String>> entry : insertMap.entrySet()) {
			if (counter.isTtlFilter(entry.getKey())) {
				List<String> list = entry.getValue();
				for (int i = 0; i < list.size(); i++) {
					String str = list.get(i);
					list.set(i, counter.getTtlSign() + str);
				}
			}
			counter.getRFilter(entry.getKey()).setInfo(entry.getValue());
		}
		counter.setInfoFinal(counter.getTitle());
		counter.setFilterFinal(counter.getTitle());
	}

	private void setMainInfo(Map<String, List<String>> insertMap) {
		for (RFilter rf : counter.getMainTitle()) {
			rf.setInfo(insertMap.get(rf.getName()));
		}
		counter.setFilterFinal(counter.getMainTitle());
	}

	private void setExcludedInfo(Map<String, List<String>> insertMap) {
		for (RFilter rf : counter.getExcludedTitle()) {
			rf.setInfo(insertMap.get(rf.getName()));
		}
		counter.setFilterFinal(counter.getExcludedTitle());
	}

}
