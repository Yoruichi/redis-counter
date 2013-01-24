package sky.redis.exception;

import redis.tool.CreatLog;

public class GroupFilterNotExistsException extends Exception {
	public GroupFilterNotExistsException(){}
	public GroupFilterNotExistsException(String message) {
		super(message);
		CreatLog.setRedisProxyInsertError(message);
	}
}
