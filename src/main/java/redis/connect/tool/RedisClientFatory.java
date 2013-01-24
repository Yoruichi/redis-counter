package redis.connect.tool;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisShardInfo;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;
import redis.tool.CreatLog;
import redis.tool.Util;

public class RedisClientFatory {

	private static String HOST = "127.0.0.1";
	private static int PORT = 6379;
	private static int MAX_ACTIVE = 20;
	private static int MAX_IDLE = 5;
	private static long MAX_WAIT = 10 * 1000l;
	private static boolean TEST_ON_BRORROW = true;
	private static String SLAVE_NAME = "Master";
	private static Map<String, JedisPool> poolMap;

	static {
		poolMap = new HashMap<String, JedisPool>();
		File file = null;
		Properties props = new Properties();
		try {
			String path = RedisClientFatory.class.getClassLoader()
					.getResource("").getPath();
			String filePath = path + "redisConfiguration.properties";
			file = new File(filePath);
		} catch (Exception e) {
		}
		if (file == null) {
			try {
				props.load(CreatLog.class
						.getResourceAsStream("../../redisConfiguration.properties"));
			} catch (Exception e) {
				System.err.println("redisConfiguration.properties is not found.");
			}
		} else {
			try {
				System.out
						.println("Load redisConfiguration.properties ... ...");
				// CreatLog.setRQLError("Load redisConfiguration.properties ... ...");
				props.load(new FileInputStream(file));
				System.out.println("host--->" + props.getProperty("HOST"));
				System.out.println("port--->" + props.getProperty("PORT"));
				// CreatLog.setRQLError("host--->"+props.getProperty("HOST"));
				// CreatLog.setRQLError("port--->"+props.getProperty ("PORT"));
				HOST = props.getProperty("HOST");
				PORT = Integer.valueOf(props.getProperty("PORT"));
				MAX_ACTIVE = Integer.valueOf(props.getProperty("MAX_ACTIVE"));
				MAX_IDLE = Integer.valueOf(props.getProperty("MAX_IDLE"));
			} catch (Exception e) {
				e.printStackTrace();
				System.out
						.println("Load redisConfiguration.properties failed.");
				System.out.println("host--->" + props.getProperty("HOST"));
				System.out.println("port--->" + props.getProperty("PORT"));
			}
		}
	}

	/*
	 * normal redis client normal redis pool
	 */
	private static JedisPool redisPool;

	/*
	 * sharding redis client sharding redis pool
	 */
	private static ShardedJedisPool shardingRedisPool;

	/*
	 * initial normal redis pool
	 */
	private synchronized static void initPool() {
		redisPool = poolMap.get(HOST + ":" + PORT);
		if (redisPool == null) {
			JedisPoolConfig poolConfig = new JedisPoolConfig();
			poolConfig.setMaxActive(MAX_ACTIVE);
			poolConfig.setMaxIdle(MAX_IDLE);
			poolConfig.setMaxWait(MAX_WAIT);
			poolConfig.setTestOnBorrow(TEST_ON_BRORROW);

			redisPool = new JedisPool(poolConfig, HOST, PORT, 10 * 1000);
			poolMap.put(HOST + ":" + PORT, redisPool);
		}
		System.out.println("connect to server:" + HOST + "port:" + PORT);
	}

	public synchronized static void initPool(Map<String, String> config) {
		if (config.containsKey("host"))
			HOST = config.get("host");
		if (config.containsKey("port"))
			PORT = Util.strToInt(config.get("port"));
		if (config.containsKey("max_active"))
			MAX_ACTIVE = Util.strToInt(config.get("max_active"));
		if (config.containsKey("max_idle"))
			MAX_IDLE = Util.strToInt(config.get("max_idle"));
		if (config.containsKey("max_wait"))
			MAX_WAIT = Util.strTolong(config.get("max_wait"));

		initPool();
	}

	/*
	 * get noemal redis client
	 */
	public static Jedis getRedisClient() {
		initPool();
		Jedis redis = null;
		try{
			redis = redisPool.getResource();
		} catch(Exception e) {
			System.out.println("Could not get a resource from the here "+HOST+":"+PORT);
			CreatLog.setRedisProxyError("Could not get a resource from the here "+HOST+":"+PORT);
		}
		return redis;
	}

	/*
	 * initial sharding redis pool
	 */
	private synchronized static void initShardedPool() {
		if (shardingRedisPool == null) {
			JedisPoolConfig poolConfig = new JedisPoolConfig();
			poolConfig.setMaxActive(MAX_ACTIVE);
			poolConfig.setMaxIdle(MAX_IDLE);
			poolConfig.setMaxWait(MAX_WAIT);
			poolConfig.setTestOnBorrow(TEST_ON_BRORROW);

			// slave connection
			java.util.List<JedisShardInfo> shards = new java.util.ArrayList<JedisShardInfo>();
			shards.add(new JedisShardInfo(HOST, PORT, SLAVE_NAME));

			shardingRedisPool = new ShardedJedisPool(poolConfig, shards);
		}
	}

	/*
	 * get sharding redis client
	 */
	public static ShardedJedis getShardingRedisClient() {
		initShardedPool();
		ShardedJedis shardingRedis = shardingRedisPool.getResource();
		return shardingRedis;
	}

	public static void returnResource(Object redis) {
		if (redis instanceof Jedis) {
			redisPool.returnResource((Jedis) redis);
			// System.out.println("return now ");
		}
		if (redis instanceof ShardedJedis) {
			// System.out.println("return now ");
			shardingRedisPool.returnResource((ShardedJedis) redis);
		}
	}
}
