package sky.redis.exception;

import redis.tool.CreatLog;

public class CountedNotExistsException extends Exception {

	public CountedNotExistsException(){}
	
	public CountedNotExistsException(String message) {
		super(message);
		CreatLog.setRedisProxyInsertError(message);
	}
	
}
