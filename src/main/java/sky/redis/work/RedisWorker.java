package sky.redis.work;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import redis.tool.CreatLog;
import sky.redis.antlr.*;
import sky.redis.exception.CountedNotExistsException;
import sky.redis.exception.CounterNotExistsException;
import sky.redis.exception.FilterNotExistsException;
import sky.redis.exception.GroupFilterNotExistsException;
import sky.redis.exception.DistinctFilterNotExistsException;
import sky.redis.exception.MainFilterNotExistsException;

public class RedisWorker {

	private redisql_skyLexer lexer;
	private redisql_skyParser parser;
	
	public void work(String rql) throws FilterNotExistsException, DistinctFilterNotExistsException, CounterNotExistsException, MainFilterNotExistsException, CountedNotExistsException, GroupFilterNotExistsException {
		lexer = new redisql_skyLexer(new ANTLRStringStream(rql));
		parser = new redisql_skyParser(new CommonTokenStream(lexer));
		CreatLog.setRedisProxyInfo(rql+"\n");
//		CreatLog.setRedisInsertDebug(rql+"\n");
		try {
			parser.rule();
		} catch (RecognitionException e) {
			CreatLog.setRedisProxyInsertError(rql+"\n" +e.getMessage());
		}
	}
	
	public List<String> insert(String rql) throws FilterNotExistsException, DistinctFilterNotExistsException, MainFilterNotExistsException, CounterNotExistsException, CountedNotExistsException {
		List<String> done=null;
		lexer = new redisql_skyLexer(new ANTLRStringStream(rql));
		parser = new redisql_skyParser(new CommonTokenStream(lexer));
		CreatLog.setRedisProxyInsertInfo(rql+"\n");
//		CreatLog.setRedisInsertDebug(rql+"\n");
		try {
			done = parser.insert();
		} catch (RecognitionException e) {
			CreatLog.setRedisProxyInsertError(rql+"\n" +e.getMessage());
		}
		return done;
	}
	public List<String> update(String rql) throws FilterNotExistsException, DistinctFilterNotExistsException, MainFilterNotExistsException, CounterNotExistsException, CountedNotExistsException {
		List<String> done=null;
		lexer = new redisql_skyLexer(new ANTLRStringStream(rql));
		parser = new redisql_skyParser(new CommonTokenStream(lexer));
		CreatLog.setRedisProxyUpdateInfor(rql+"\n");
//		CreatLog.setRedisInsertDebug(rql+"\n");
		try {
			done = parser.update();
		} catch (RecognitionException e) {
			CreatLog.setRedisProxyInsertError(rql+"\n" +e.getMessage());
		}
		return done;
	}
	
	public Map<String, String> select(String rql) throws MainFilterNotExistsException, FilterNotExistsException, CounterNotExistsException, GroupFilterNotExistsException, CountedNotExistsException {
		Map<String, String> map = new HashMap<String, String>();
		lexer = new redisql_skyLexer(new ANTLRStringStream(rql));
		parser = new redisql_skyParser(new CommonTokenStream(lexer));
		CreatLog.setRedisProxySelectInfo(rql+"\n");
//		CreatLog.setRedisInsertDebug(rql+"\n");
		try {
			map = parser.select();
		} catch (RecognitionException e) {
			CreatLog.setRedisProxyInsertError(rql+"\n" +e.getMessage());
		}
		return map;
	}

	public String desc(String rql) {
		String info="";
		lexer = new redisql_skyLexer(new ANTLRStringStream(rql));
		parser = new redisql_skyParser(new CommonTokenStream(lexer));
		CreatLog.setRedisProxyInfo(rql+"\n");
//		CreatLog.setRedisInsertDebug(rql+"\n");
			try {
				info = parser.desc();
			} catch (RecognitionException e) {
				CreatLog.setRedisProxyInsertError(rql+"\n" +e.getMessage());
			}
		return info;
	}
	
	public void counterManager(String rql) {
		lexer = new redisql_skyLexer(new ANTLRStringStream(rql));
		parser = new redisql_skyParser(new CommonTokenStream(lexer));
		CreatLog.setRedisProxyInfo(rql+"\n");
//		CreatLog.setRedisInsertDebug(rql+"\n");
			try {
				parser.manager();
			} catch (RecognitionException e) {
				CreatLog.setRedisProxyInsertError(rql+"\n" +e.getMessage());
			}
	}
	
}
