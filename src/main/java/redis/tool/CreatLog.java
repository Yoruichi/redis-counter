package redis.tool;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.PropertyConfigurator;

public class CreatLog {

	static {
		File file = null;
		try {
			String path = CreatLog.class.getClassLoader().getResource("")
					.getPath();
			String filePath = path + "redis.log4j.properties";
			file = new File(filePath);
		} catch (Exception e) {
		}
		Properties prop = new Properties();
		if (file == null) {
			try {
				prop.load(CreatLog.class
						.getResourceAsStream("../../redis.log4j.properties"));
			} catch (Exception e) {
				System.err.println("redis.log4j.peoperties is not found.");
			}
		} else {
			try {
				prop.load(new FileInputStream(file));
			} catch (FileNotFoundException e) {
				System.err.println("redis.log4j.peoperties is not found.");
			} catch (IOException e) {
				System.err.println("redis.log4j.peoperties is not found.");
			}
		}
		PropertyConfigurator.configure(prop);
	}

	private static final Log RedisProxyInfo = LogFactory.getLog("RedisProxyInfo");

	public static void setRedisProxyInfo(String Message) {
		RedisProxyInfo.info(Message);
	}

	private static final Log RedisProxyDebug = LogFactory.getLog("RedisProxyDebug");

	public static void setRedisProxyDebug(String Message) {
		RedisProxyDebug.debug(Message);
	}

	private static final Log RedisProxyError = LogFactory
			.getLog("RedisProxyError");

	public static void setRedisProxyError(String Message) {
		RedisProxyError.error(Message);
	}

	private static final Log RedisProxyInsertInfo = LogFactory
			.getLog("RedisProxyInsertInfo");

	public static void setRedisProxyInsertInfo(String Message) {
		RedisProxyInsertInfo.info(Message);
	}
	private static final Log RedisProxyInsertError = LogFactory
			.getLog("RedisProxyInsertError");
	
	public static void setRedisProxyInsertError(String Message) {
		RedisProxyInsertError.info(Message);
	}

	private static final Log RedisProxyCreateInfo = LogFactory
			.getLog("RedisProxyCreateInfo");

	public static void setRedisProxyCreateInfor(String Message) {
		RedisProxyCreateInfo.info(Message);
	}

	private static final Log RedisProxySelectInfo = LogFactory
			.getLog("RedisProxySelectInfo");

	public static void setRedisProxySelectInfo(String Message) {
		RedisProxySelectInfo.info(Message);
	}

	private static final Log RedisProxyUpdateInfo = LogFactory
			.getLog("RedisProxyUpdateInfo");

	public static void setRedisProxyUpdateInfor(String Message) {
		RedisProxyUpdateInfo.info(Message);
	}
}
