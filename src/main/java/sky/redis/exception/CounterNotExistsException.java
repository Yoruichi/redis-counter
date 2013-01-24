package sky.redis.exception;

import redis.tool.CreatLog;

public class CounterNotExistsException extends Exception {
	public CounterNotExistsException(){}
	public CounterNotExistsException(String message) {
		super(message);
		CreatLog.setRedisProxyInsertError(message);
	}
}
