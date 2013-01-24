package sky.redis.core;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import redis.clients.jedis.Jedis;
import redis.connect.tool.RedisClientFatory;
import redis.key.demo.ConstString;
import redis.tool.CreatLog;
import redis.tool.Util;
import sky.redis.data.model.RCounter;
import sky.redis.exception.CounterNotExistsException;

public class RedisCounterManager {

	private RCounter counter;

	private void initCounter(String counterName)
			throws CounterNotExistsException {
		Jedis redis = null;
		try {
			redis = RedisClientFatory.getRedisClient();
			if (redis != null) {
				if (redis != null) {
					String counterInfo = redis.get(counterName);
					if (counterInfo == null)
						throw new CounterNotExistsException(counterName
								+ " is not exists.");
					counter = new ObjectMapper().readValue(counterInfo,
							RCounter.class);
				}
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
	}

	public void setTtl(String counterName, String time) {
		try {
			initCounter(counterName);
		} catch (CounterNotExistsException e) {

		}
		int ttl = Util.strToInt(time) * 60 * 60;
		counter.setTtl(ttl);
		updateCounter();
		System.out.println("set ttl ok.");
	}

	public void setTtlSign(String counterName, String sign) {
		try {
			initCounter(counterName);
		} catch (CounterNotExistsException e) {

		}
		String ttlSign = sign + ConstString.SPLITER;
		counter.setTtlSign(ttlSign);
		updateCounter();
		System.out.println("set ttl sign ok.");
	}
	
	private void updateCounter() {
		Jedis redis = null;
		try {
			redis = RedisClientFatory.getRedisClient();
			if (redis != null) {
				String str = counter.toRedisValue();
				redis.set(counter.getName(), str);
				CreatLog.setRedisProxyCreateInfor(counter.getName() + "-->"
						+ str);
			}
		} finally {
			RedisClientFatory.returnResource(redis);
		}
	}

	public String desc(String counterName) {
		String info = "";
		try {
			initCounter(counterName);
		} catch (CounterNotExistsException e) {
			info = counterName + " is not exists.";
		}
		if (counter != null)
			info = counter.toString();
		System.out.println(info);
		return info;
	}

}
