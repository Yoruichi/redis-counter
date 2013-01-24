package sky.redis.exception;

import redis.tool.CreatLog;

public class FilterNotExistsException extends Exception {

	public FilterNotExistsException(){}
	
	public FilterNotExistsException(String mess) {
		super(mess);
		CreatLog.setRedisProxyInsertError(mess);
	}
	
}
