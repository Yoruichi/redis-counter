package sky.redis.core;

import java.util.List;

import redis.clients.jedis.Jedis;
import redis.connect.tool.RedisClientFatory;
import redis.key.demo.ConstString;
import redis.tool.CreatLog;
import redis.tool.Util;
import sky.redis.data.model.RCounted;
import sky.redis.data.model.RCounter;
import sky.redis.data.model.RFilter;
import sky.redis.exception.FilterNotExistsException;

public class RedisCreater {

	private RCounter counter = new RCounter();

	private void setTitle(List<RFilter> title) {
		for (int i = 0; i < title.size(); i++) {
			title.get(i).setIndex(i);
		}
		this.counter.setTitle(title);
	}

	private void setCounterName(String CounterName) {
		this.counter.setName(CounterName);
	}

	private void setRCounted(String name) {
		this.counter.setCounted(new RCounted(name));
	}

	public void finishCounter(String name, List<RFilter> title, String cname) {
		setCounterName(name);
		setTitle(title);
		setRCounted(cname);
	}

	public void setMainFilter(List<RFilter> mainFilters)
			throws FilterNotExistsException {
		confirme(mainFilters);
		counter.setMainTitle(mainFilters);
		counter.setMainTitleFinal();
	}

	public void setDisFilter(List<RFilter> mainFilters)
			throws FilterNotExistsException {
		confirme(mainFilters);
		counter.setDisTitle(mainFilters);
		counter.setDisTitleFinal();
	}

	public void setExcludeFilter(List<RFilter> mainFilters)
			throws FilterNotExistsException {
		confirme(mainFilters);
		counter.setExcludedTitle(mainFilters);
		counter.setExcludedTitleFinal();
	}

	public void setGroupFilter(List<RFilter> mainFilters)
			throws FilterNotExistsException {
		confirme(mainFilters);
		counter.setGroupTitle(mainFilters);
		counter.setGroupTitleFinal();
	}

	public void setTtlFilter(List<RFilter> mainFilters)
			throws FilterNotExistsException {
		confirme(mainFilters);
		counter.setTtlTitle(mainFilters);
		counter.setTtlTitleFinal();
	}

	private void confirme(List<RFilter> mainFilters)
			throws FilterNotExistsException {
		for (RFilter rf : mainFilters) {
			if (!counter.contains(rf))
				throw new FilterNotExistsException(rf.getName()
						+ " is not exists in " + counter.getName());
		}
	}

	public void create() {
		Jedis redis = null;
		try {
			redis = RedisClientFatory.getRedisClient();
			if (redis != null) {
				String str = counter.toRedisValue();
				redis.set(counter.getName(), str);
				CreatLog.setRedisProxyCreateInfor(counter.getName() + "-->"
						+ str);
			}
		} finally {
			RedisClientFatory.returnResource(redis);
		}
		// System.out.println(counter.getTitle());
	}

	public void setTtl(String time) {
		int ttl = Util.strToInt(time);
		ttl = ttl * 60 * 60;
		counter.setTtl(ttl);
	}

	public void setTtlSign(String sign) {
		String ttlSign = sign + ConstString.SPLITER;
		counter.setTtlSign(ttlSign);
	}

	public void setCounter(RCounter counter) {
		this.counter = counter;
	}

	public RCounter getCounter() {
		return counter;
	}
}
