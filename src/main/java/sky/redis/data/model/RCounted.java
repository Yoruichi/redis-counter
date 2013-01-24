package sky.redis.data.model;

public class RCounted {

	private String name;
	private long value;
	
	public RCounted(){}
	
	public RCounted(String name) {
		this.name = name;
		this.value = 1l;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getValue() {
		return value;
	}
	public void setValue(long value) {
		this.value = value;
	}
	
}
