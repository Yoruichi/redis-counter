package sky.redis.core;

import java.util.Map;

import redis.connect.tool.RedisClientFatory;

public class RedisConfig {

	public void config(Map<String,String> configMap) {
		RedisClientFatory.initPool(configMap);
	}
	
}
