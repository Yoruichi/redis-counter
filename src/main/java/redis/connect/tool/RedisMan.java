package redis.connect.tool;

import java.util.Set;

import redis.clients.jedis.Jedis;
import sky.redis.client.RedisqlClient;
import sky.redis.core.KeyFactory;
import sky.redis.exception.CountedNotExistsException;
import sky.redis.exception.CounterNotExistsException;
import sky.redis.exception.DistinctFilterNotExistsException;
import sky.redis.exception.FilterNotExistsException;
import sky.redis.exception.GroupFilterNotExistsException;
import sky.redis.exception.MainFilterNotExistsException;

public class RedisMan {

	public static void main(String[] args) {
		Jedis redis = RedisClientFatory.getRedisClient();
		redis.flushAll();
//		String key="login:0all':110177:2all':3all':4all':512101900:userid";
//		String rKey = KeyFactory.toRedisKey(key);
//		Set<String> set = redis.smembers(rKey);
//		for (String str : set) {
//			System.out.println(str);
//		}
		System.out.println(redis.keys("*").size());
		RedisqlClient client = new RedisqlClient();
		try {
			client.create("create counter install filter{num counted, developerid, productid, " +
					"platformid, version, partnerid, time, hour, deviceid} " +
					"main filter{developerid, productid} " +
					"distinct filter{deviceid} " +
					"ttl filter{time} "+
					"group filter{productid,version, partnerid, hour};");
			client.create("create counter register filter{num counted,developerid,productid,platformid,version,partnerid,time,hour,sex,age,area,mobile,userid} " +
					"main filter{developerid,productid} " +
					"distinct filter{userid} " +
					"ttl filter{time} "+
					"excluded filter{hour,sex,age,area,mobile} "+
					"group filter{version,partnerid,hour,sex,age,area,productid,mobile};");
			client.create("create counter login filter{num counted,developerid,productid,platformid,version,partnerid,time,hour,sex,age,area,level,userid} " +
					"main filter{developerid,productid,time} "+
					"distinct filter{userid} " +
					"ttl filter{time} "+
					"excluded filter{hour,sex,age,area,level} "+
					"group filter{version,partnerid,hour,sex,age,area,level,time};");
			client.create("create counter sumlogin filter{num counted,developerid,productid,platformid,version,partnerid,hour,sex,age,area,level,userid} " +
					"main filter{developerid,productid} "+
					"distinct filter{userid} " +
					"excluded filter{hour,sex,age,area,level} "+
					"group filter{version,partnerid,hour,sex,age,area,level};");
			client.create("create counter usetime filter{num counted,developerid,productid,platformid,version,partnerid,time,hour,sex,age,area,level} "+
					"main filter{developerid,productid} "+
					"ttl filter{time} "+
					"excluded filter{hour,sex,age,area,level} "+
					"group filter{version,partnerid,hour,sex,age,area,level};");
			client.create("create counter startup filter{num counted,developerid,productid,platformid,version,partnerid,time,hour,sex,age,area,level} "+
					"main filter{developerid,productid} "+
					"ttl filter{time} "+
					"excluded filter{hour,sex,age,area,level} "+
					"group filter{version,partnerid,hour,sex,age,area,level};");
			client.create("create counter charge filter{num counted,developerid,productid,platformid,version,partnerid,time,userid} "+
					"main filter{developerid,productid} "+
					"ttl filter{time} "+
					"distinct filter{userid};");
			client.create("create counter usetimeInfo filter{num counted,developerid,productid,platformid,version,partnerid,time,usetimelevel} "+
					"main filter{developerid,productid} "+
					"ttl filter{time} "+
					"group filter{usetimelevel};");
			client.create("create counter custom filter{num counted,developerid,productid,platformid,version,partnerid,time,eventid,label} "+
					"main filter{developerid,productid} "+
					"ttl filter{time} "+
					"group filter{eventid,label};");
			client.create("create counter customuser filter{num counted,developerid,productid,platformid,version,partnerid,time,eventid,label,userid} "+
					"main filter{developerid,productid} "+
					"ttl filter{time} "+
					"group filter{eventid,label} " +
					"distinct filter{userid};");
			client.create("create counter customkeyvalue filter{num counted,developerid,productid,platformid,version,partnerid,time,eventid,label,key,value} "+
					"main filter{developerid,productid} "+
					"ttl filter{time} "+
					"group filter{label,key,value};");
			client.create("create counter customsumvalue filter{num counted,developerid,productid,platformid,version,partnerid,time,eventid,label,key,value} "+
					"main filter{developerid,productid} "+
					"ttl filter{time} "+
					"group filter{key};");
			client.create("create counter customvaluesum filter{num counted,developerid,productid,platformid,version,partnerid,time,eventid,label,key,value} "+
					"main filter{developerid,productid} "+
					"ttl filter{time} "+
					"group filter{key};");
			client.create("create counter exceptionnum filter{num counted,developerid,productid,platformid,version,partnerid,time,shothashcode} "+
					"main filter{developerid,productid} "+
					"ttl filter{time} "+
					"group filter{shothashcode};");
			client.create("create counter exceptiontime filter{num counted,developerid,productid,platformid,version,partnerid,time,shothashcode} "+
					"main filter{developerid,productid} "+
					"ttl filter{time} "+
					"group filter{shothashcode};");
			client.create("create counter missionview filter{num counted,developerid,productid,platformid,version,partnerid,time,mission} "+
					"main filter{developerid,productid} " +
					"ttl filter{time} "+
					"group filter{mission};");
			client.create("create counter missionexit filter{num counted,developerid,productid,platformid,version,partnerid,time,mission} "+
					"main filter{developerid,productid} " +
					"ttl filter{time} "+
					"group filter{mission};");
			client.create("create counter pageview filter{num counted,developerid,productid,platformid,version,partnerid,time,activityname} "+
					"main filter{developerid,productid} " +
					"ttl filter{time} "+
					"group filter{activityname};");
			client.create("create counter pageexit filter{num counted,developerid,productid,platformid,version,partnerid,time,activityname} "+
					"main filter{developerid,productid} " +
					"ttl filter{time} "+
					"group filter{activityname};");
			
			String[] sql={"insert install {developerid=2000152,productid=10169,platformid=1,version=1.0,partnerid=13344,time=12101100,hour=14,deviceid=8fcc8f74f17f986970e8946b467b187b };",
			  "insert register {developerid=2000152,productid=10169,platformid=1,version=1.0,partnerid=13344,time=12101000,hour=13,sex=2,age=13,area=tianjing,mobile=小米,userid=103 };",
			  "insert login {developerid=2000152,productid=10169,platformid=1,version=1.0,partnerid=13344,time=12100900,hour=05,sex=2,age=13,area=beijing,level=1,userid=105 };",
			  "insert sumlogin {developerid=2000152,productid=10169,platformid=1,version=1.0,partnerid=13344,hour=05,sex=2,age=13,area=beijing,level=1,userid=105 };",
			  "insert login {developerid=2000152,productid=10169,platformid=1,version=1.0,partnerid=13344,time=12101000,hour=05,sex=2,age=13,area=beijing,level=1,userid=105 };",
			  "insert login {developerid=2000152,productid=10169,platformid=1,version=1.0,partnerid=13344,time=12101100,hour=05,sex=2,age=13,area=beijing,level=1,userid=105 };",
			  "insert sumlogin {developerid=2000152,productid=10169,platformid=1,version=1.0,partnerid=13344,hour=05,sex=2,age=14,area=beijing,level=1,userid=105 };",
			  "insert login {developerid=2000152,productid=10169,platformid=1,version=1.0,partnerid=13344,time=12101100,hour=05,sex=2,age=13,area=beijing,level=1,userid=105 };",
			  "insert startup {developerid=2000152,productid=10169,platformid=1,version=1.0,partnerid=13344,time=12100900,hour=10,sex=2,age=13,area=beijing,level=1 };",
			  "insert missionview {developerid=2000152,productid=10169,platformid=1,version=1.0,partnerid=13344,time=12101000,mission=第一关 };",
			  "insert missionexit {developerid=2000152,productid=10169,platformid=1,version=1.0,partnerid=13344,time=12100900,mission=开始 };",
			  "insert custom {developerid=2000152,productid=10169,platformid=1,version=1.0,partnerid=13344,time=12101000,eventid=WidgetSelectModeButton,label=widget切换模式按钮 };",
			  "insert custom {developerid=2000152,productid=10169,platformid=1,version=1.0,partnerid=13344,time=12101000,eventid=ClearProccesses,label=清理后台程序按钮 };",
			  "insert customuser {developerid=2000152,productid=10169,platformid=1,version=1.0,partnerid=13344,time=12101000,eventid=WidgetSelectModeButton,label=widget切换模式按钮,userid=122 };",
			  "insert pageview {developerid=2000152,productid=10169,platformid=1,version=1.0,partnerid=13344,time=12101100,activityname=注册用户};",
			 "insert exceptionnum {developerid=2000152,productid=10169,platformid=1,version=1.0,partnerid=13344,time=12101100,shothashcode=-1129789482};",
			 "insert usetimeInfo {developerid=2000152,productid=10169,platformid=1,version=1.0,partnerid=13344,time=12101100,usetimelevel=4};"};
//			for(String rql:sql)
//				client.insert(rql);
			
			
			
			
			
		} catch (FilterNotExistsException e) {
			e.printStackTrace();
		} catch (DistinctFilterNotExistsException e) {
			e.printStackTrace();
		} catch (CounterNotExistsException e) {
			e.printStackTrace();
		} catch (MainFilterNotExistsException e) {
			e.printStackTrace();
		} catch (CountedNotExistsException e) {
			e.printStackTrace();
		} catch (GroupFilterNotExistsException e) {
			e.printStackTrace();
		}
	}
	
}
