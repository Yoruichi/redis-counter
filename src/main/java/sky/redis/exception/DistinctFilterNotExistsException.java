package sky.redis.exception;

import redis.tool.CreatLog;

public class DistinctFilterNotExistsException extends Exception {

	public DistinctFilterNotExistsException(){}
	
	public DistinctFilterNotExistsException(String mess) {
		super(mess);
		CreatLog.setRedisProxyInsertError(mess);
	}
	
}
