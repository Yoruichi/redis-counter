package sky.redis.client;

import java.util.List;
import java.util.Map;

import sky.redis.core.KeyFactory;
import sky.redis.exception.CountedNotExistsException;
import sky.redis.exception.CounterNotExistsException;
import sky.redis.exception.DistinctFilterNotExistsException;
import sky.redis.exception.FilterNotExistsException;
import sky.redis.exception.GroupFilterNotExistsException;
import sky.redis.exception.MainFilterNotExistsException;
import sky.redis.work.RedisWorker;

public class RedisqlClient {

	private RedisWorker worker = new RedisWorker();

	public String desc(String rql) {
		String info = worker.desc(rql);
		return info;
	}
	
	public void setTtl(String rql) {
		worker.counterManager(rql);
	}
	
	public void setTtlSign(String rql) {
		worker.counterManager(rql);
	}
	
	public void create(String sql) throws FilterNotExistsException,
			DistinctFilterNotExistsException, CounterNotExistsException,
			MainFilterNotExistsException, CountedNotExistsException,
			GroupFilterNotExistsException {
		worker.work(sql);
	}

	public List<String> insert(String sql) throws FilterNotExistsException,
			DistinctFilterNotExistsException, CounterNotExistsException,
			MainFilterNotExistsException, CountedNotExistsException,
			GroupFilterNotExistsException {
		return worker.insert(sql);
	}
	public void update(String sql) throws FilterNotExistsException,
	DistinctFilterNotExistsException, CounterNotExistsException,
	MainFilterNotExistsException, CountedNotExistsException,
	GroupFilterNotExistsException {
		worker.update(sql);
	}

	public Map<String, String> select(String sql)
			throws FilterNotExistsException, DistinctFilterNotExistsException,
			CounterNotExistsException, MainFilterNotExistsException,
			CountedNotExistsException, GroupFilterNotExistsException {
		return worker.select(sql);
	}

	public RedisWorker getWorker() {
		return worker;
	}

	public void setWorker(RedisWorker worker) {
		this.worker = worker;
	}

	public static void main(String[] args) {
		
		
		RedisqlClient client = new RedisqlClient();
		try {
//			String sql="insert install {developerid=2000152,productid=10169,platformid=1,version=1.0,partnerid=13344,time=12101100,hour=10, deviceid=zhangwei};";
			String sql="insert login {developerid=2000152,productid=10171,platformid=1,version=1.0,partnerid=75545,time=12101100,userid=zhangwei,sex=2,hour=17,area=beijing,age=23,level=124};";
//			String sql = "insert startup {developerid=2000155,productid=10183,platformid=1,version=2.1.9,partnerid=75566,time=12110200,hour=0,sex=2,age=1,area=unknow,level=14 };";
			System.out.println(client.insert(sql));
//			System.out.println(client.select("select num from usetimeInfo where developerid=2000152  and productid=10169 and platformid=1 and time=12101100 group by usetimelevel;"));
			for(int i=0;i<12000;i++)
			System.out.println(client.select("select num from login where developerid=2000152  and productid=10171 and platformid=1 and time=12101100;"));
//			Map<String,String> map=client.select("selectAll from install where developerid=2000152 group by productid;");
//			Map<String,String> map=client.select("select num from register where productid=10169 group by partnerid;");
//			Map<String,String> map1=client.select("selectAll from register where productid=10169 group by partnerid;");
//			Map<String,String> map2=client.select("selectAll from register where productid=10169 ;");
//			Map<String,String> map3=client.select("select num from usetime where productid=10177 and time=12101800;");
//			Map<String,String> map=client.select("select num from install where developerid=2000152 and productid=10169;");
//			System.out.println(map);
		} catch (CounterNotExistsException e) {
			e.printStackTrace();
		} catch (FilterNotExistsException e) {
			e.printStackTrace();
		} catch (DistinctFilterNotExistsException e) {
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
