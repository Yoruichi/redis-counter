package sky.redis.exception;

import redis.tool.CreatLog;

public class MainFilterNotExistsException extends Exception {

	public MainFilterNotExistsException() {
	}

	public MainFilterNotExistsException(String mess) {
		super(mess);
		CreatLog.setRedisProxyInsertError(mess);
	}

}
