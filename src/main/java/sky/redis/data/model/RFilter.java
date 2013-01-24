package sky.redis.data.model;

import java.util.ArrayList;
import java.util.List;

import redis.key.demo.ConstString;
import redis.key.demo.Stack;

public class RFilter implements Comparable<RFilter> {

	private String name = "";
	private List<String> info = new ArrayList<String>();
	private int index = 0;
	private boolean main = false;
	private boolean distinct = false;
	private boolean group = false;
	private boolean ttl = false;

	private List<RFilter> children = new ArrayList<RFilter>();

	public RFilter() {
	};

	public RFilter(String name) {
		this.setName(name);
	}

	public void setInfoFinal() {
		info.add(ConstString.ALL);
	}

	public RFilter addChild(RFilter rf) {
		getChildren().add(rf);
		return this;
	}

	public void getPath(Stack<String> stack, List<String> pathList) {
		for (String string : info) {
			stack.push(this.index+string + ConstString.SPLITER);
			if (this.getChildren() == null || this.getChildren().size() == 0) {
				pathList.add(ConstString.SPLITER + stack.toString());
//				continue;
			} else {
				for (RFilter node : this.getChildren()) {
					node.getPath(stack, pathList);
				}
//				stack.pop();
			}
			stack.pop();
		}
	}

	public String toString() {
		StringBuffer sb = new StringBuffer("name:" + name + " index:" + index
				+ " isMain:" + main + " isdistinct:" + distinct + " isGroup:"
				+ group);
		sb.append(" children:{");
		for (RFilter rf : getChildren()) {
			sb.append(rf.getName() + ",");
		}
		sb.append("} info:{");
		for (String s : info) {
			sb.append(s + ",");
		}
		sb.append("}");
		return sb.toString();
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isMain() {
		return main;
	}

	public void setMain(boolean main) {
		this.main = main;
	}

	public int compareTo(RFilter rf) {
		return index - rf.getIndex();
	}

	public boolean isDistinct() {
		return distinct;
	}

	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	public boolean isGroup() {
		return group;
	}

	public void setGroup(boolean group) {
		this.group = group;
	}

	public List<String> getInfo() {
		return info;
	}

	public void setInfo(List<String> info) {
		this.info = info;
	}

	public List<RFilter> getChildren() {
		return children;
	}

	public void setChildren(List<RFilter> children) {
		this.children = children;
	}

	public boolean isTtl() {
		return ttl;
	}

	public void setTtl(boolean ttl) {
		this.ttl = ttl;
	}

}
