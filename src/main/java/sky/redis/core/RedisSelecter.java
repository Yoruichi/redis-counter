package sky.redis.core;

import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import redis.clients.jedis.Jedis;
import redis.connect.tool.RedisClientFatory;
import redis.key.demo.ConstString;
import redis.tool.Util;
import sky.redis.data.model.RCounter;
import sky.redis.data.model.RFilter;
import sky.redis.exception.*;

public class RedisSelecter {

	private RCounter counter;
	private boolean mainFlag = true;
	private Map<String, List<String>> groupMap = new HashMap<String, List<String>>();

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

	private String groupKeyFormat(String key, String index) {
		key = key.substring(1, key.lastIndexOf(ConstString.SPLITER));
		if (key.startsWith(index))
			key = key.substring(index.length(), key.length());
		return key;
	}

	// public Map<String, String> selectAll(Map<String, List<String>> selectMap)
	// throws MainFilterNotExistsException {
	// Jedis redis = RedisClientFatory.getRedisClient();
	// Map<String, String> resultMap = new HashMap<String, String>();
	// confirmeMain(selectMap);
	// if (mainFlag) {
	// setMainInfo(selectMap);
	// }
	// setMainInfoFinal();
	// List<String> keys = KeyFactory.getKeys(ConstString.distinct, counter);
	// if (groupMap.size() > 0) {
	// List<String> groupKeys = KeyFactory.getKeys(ConstString.groupKey,
	// counter);
	// Map<String, List<String>> map = makeGroup(keys, groupKeys);
	//
	// for (Entry<String, List<String>> entry : map.entrySet()) {
	// long result = 0l;
	// for (String key : entry.getValue()) {
	// String k = KeyFactory.toRedisKey(key);
	// result = result + redis.scard(k);
	// }
	// resultMap.put(entry.getKey(), String.valueOf(result));
	// }
	// } else {
	// long num = 0;
	// for (String key : keys) {
	// String k = KeyFactory.toRedisKey(key);
	// long length = redis.scard(k);
	// resultMap.put(key, String.valueOf(length));
	// num = num + length;
	// }
	// resultMap.put(ConstString.result, String.valueOf(num));
	// }
	// RedisClientFatory.returnResource(redis);
	// System.out.println(resultMap);
	// return resultMap;
	// }

	public Map<String, String> select(String counted,
			Map<String, List<String>> selectMap)
			throws CountedNotExistsException, FilterNotExistsException {
		Jedis redis = null;
		try {
			redis = RedisClientFatory.getRedisClient();
			if (redis != null) {
				Map<String, String> resultMap = new HashMap<String, String>();
				confirme(counted, selectMap);

				setInfo(selectMap);
				List<String> keys = KeyFactory.getKeys(ConstString.title,
						counter);
				if (groupMap.size() > 0) {
					List<String> groupKeys = KeyFactory.getKeys(
							ConstString.groupKey, counter);
					Map<String, List<String>> map = makeGroup(keys, groupKeys);

					for (Entry<String, List<String>> entry : map.entrySet()) {
						long result = 0l;
						for (String key : entry.getValue()) {
							String k = KeyFactory.toRedisKey(key);
							result = result + Util.strTolong(redis.get(k));
						}
						result = result / (100 * 100);
						resultMap.put(entry.getKey(), String.valueOf(result));
					}
				} else {
					long result = 0l;
					for (String key : keys) {
						String k = KeyFactory.toRedisKey(key);
						String res = redis.get(k);
						result = result + Util.strTolong(res);
						resultMap.put(
								key,
								String.valueOf(Util.strTolong(res)
										/ (100 * 100)));
					}
					result = result / (100 * 100);
					resultMap.put(ConstString.result, String.valueOf(result));
				}
				System.out.println(resultMap);
				return resultMap;
			}
			return null;
		} finally {
			RedisClientFatory.returnResource(redis);
		}
	}

	private String groupKeyFormat(String gk) {
		String[] temp = gk.split(ConstString.ALL + ConstString.SPLITER);
		StringBuffer sb = new StringBuffer();
		for (String string : temp) {
			if (string.contains(ConstString.SPLITER))
				sb.append(string.substring(0,
						string.lastIndexOf(ConstString.SPLITER)));
		}
		String info = sb.toString();
		if (info.startsWith(ConstString.SPLITER))
			return info + ConstString.SPLITER;
		else
			return ConstString.SPLITER + sb.toString() + ConstString.SPLITER;
	}

	private Map<String, List<String>> makeGroup(List<String> keys,
			List<String> groupKey) {
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		for (String index : groupIndexList) {
			for (String gk : groupKey) {
				// ttl sign process is not done
				gk = groupKeyFormat(gk);
				String k = groupKeyFormat(gk, index);
				List<String> list = new ArrayList<String>();
				for (String key : keys) {
					if (Util.strContainsStr(key, gk)) {
						list.add(key);
					}
				}
				k = k.replaceAll(counter.getTtlSign(), "");
				map.put(k, list);
			}
		}
		return map;
	}

	public void group(Map<String, List<String>> selectMap,
			List<String> groupList) throws GroupFilterNotExistsException,
			FilterNotExistsException {
		confirmeGroup(groupList);
		getGroupIndex(groupList);
		getGroupInfo(selectMap, groupList);
		setGroupIntoMap(selectMap);
		setGroupInfo();
	}

	private List<String> groupIndexList = new ArrayList<String>();

	private void getGroupIndex(List<String> groupList) {
		for (String name : groupList) {
			groupIndexList.add(String.valueOf(counter.getRFilter(name)
					.getIndex()));
		}
	}

	private void setGroupIntoMap(Map<String, List<String>> selectMap) {
		for (String name : selectMap.keySet()) {
			if (groupMap.containsKey(name)) {
				groupMap.put(name, selectMap.get(name));
			}
		}
		for (String key : groupMap.keySet()) {
			if (!selectMap.containsKey(key)) {
				List<String> list = groupMap.get(key);
				selectMap.put(key, list);
			}
		}
	}

	private void getGroupInfo(Map<String, List<String>> selectMap,
			List<String> list) {
		Jedis redis = null;
		try {
			redis = RedisClientFatory.getRedisClient();
			if (redis != null) {
				StringBuffer sb = new StringBuffer();
				setMainInfo(selectMap);
				List<String> mainKeyList = KeyFactory.getKeys(ConstString.main,
						counter);
				for (String string : mainKeyList) {
					for (String name : list) {
						sb.append(string);
						groupMap.put(
								name,
								new ArrayList<String>(redis.smembers(KeyFactory
										.toRedisKey(sb.toString() + name))));
					}
				}
			}
		} finally {
			RedisClientFatory.returnResource(redis);
		}
	}

	private void confirmeGroup(List<String> groupList)
			throws GroupFilterNotExistsException {
		for (String string : groupList) {
			if (!counter.isGroupFilter(string)) {
				throw new GroupFilterNotExistsException(string
						+ " is not group filter in " + counter.getName());
			}
		}
	}

	private void setInfo(Map<String, List<String>> insertMap) {
		counter.setInfoFinal(counter.getTitle());
		for (Entry<String, List<String>> entry : insertMap.entrySet()) {
			if (counter.isTtlFilter(entry.getKey())) {
				List<String> list = entry.getValue();
				for (int i = 0; i < list.size(); i++) {
					String str = list.get(i);
					if (!str.contains(counter.getTtlSign()))
						list.set(i, counter.getTtlSign() + str);
				}
			}
			counter.getRFilter(entry.getKey()).setInfo(entry.getValue());
		}
		counter.setFilterFinal(counter.getTitle());
	}

	private void setGroupInfo() {
		counter.setInfoFinal(counter.getGroupTitle());
		for (Entry<String, List<String>> entry : groupMap.entrySet()) {
			counter.getGroupRFilter(entry.getKey()).setInfo(entry.getValue());
		}
		counter.setFilterFinal(counter.getGroupTitle());
	}

	// private void setMainInfoFinal() {
	// for (Entry<String, List<String>> entry : groupMap.entrySet()) {
	// if (counter.isMainFilter(entry.getKey()))
	// counter.getMainRFilter(entry.getKey())
	// .setInfo(entry.getValue());
	// }
	// }

	private void setMainInfo(Map<String, List<String>> selectMap) {
		counter.setInfoFinal(counter.getMainTitle());
		for (Entry<String, List<String>> entry : selectMap.entrySet()) {
			if (counter.isMainFilter(entry.getKey()))
				counter.getMainRFilter(entry.getKey())
						.setInfo(entry.getValue());
			if (counter.isTtlFilter(entry.getKey())) {
				List<String> list = entry.getValue();
				for (int i = 0; i < list.size(); i++) {
					String str = list.get(i);
					if (!str.contains(counter.getTtlSign()))
						list.set(i, counter.getTtlSign() + str);
				}
				counter.getRFilter(entry.getKey()).setInfo(entry.getValue());
			}
		}
		counter.setFilterFinal(counter.getMainTitle());
		mainFlag = false;
	}

	private void confirme(String counted, Map<String, List<String>> selectMap)
			throws FilterNotExistsException, CountedNotExistsException {
		if (!counter.isCounted(counted)) {
			throw new CountedNotExistsException(counted
					+ " is not the counted value for " + counter.getName());
		}
		confirme(selectMap);
	}

	private void confirme(Map<String, List<String>> selectMap)
			throws FilterNotExistsException {
		for (String key : selectMap.keySet()) {
			if (!counter.contains(new RFilter(key)))
				throw new FilterNotExistsException(key
						+ " is not exists in counter: " + counter.getName());
		}
	}

	// private void confirmeMain(Map<String, List<String>> selectMap)
	// throws MainFilterNotExistsException {
	// for (String string : selectMap.keySet()) {
	// if (!counter.isMainFilter(string)) {
	// throw new MainFilterNotExistsException(string
	// + " is not main filter in " + counter.getName());
	// }
	// }

	// for (RFilter rf : counter.getMainTitle()) {
	// if (!selectMap.containsKey(rf.getName())) {
	// throw new MainFilterNotExistsException(rf.getName()
	// + " is in counter " + counter.getName()
	// + " as main filter but is unassigned in RQL");
	// }
	// }
	// }

}
