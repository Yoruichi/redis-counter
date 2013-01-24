package redis.key.demo;

import java.util.ArrayList;
import java.util.List;

public class Node {

//	all(),
//	developerId("developerId"), // 开发者编号
//	event("event"), // 事件类型
//	gameId("gameId"), // 游戏编号
//	deviceIMEI("deviceIMEI"), // 设备串号
//
//	playerId("playerId"), // 玩家注册编号
//	playerSex("playerSex"), // 玩家性别信息
//	playerLevel("playerLevel"), // 玩家等级信息
//	playerAge("playerAge"), // 玩家年龄信息
//
//	platform("platform"), // 游戏平台 1：android 2：IOS 3：wp7.5
//	timeDate("timeDate"), // 时间 日期 仅保留今日和昨日信息
//
//	version("version"), // 游戏版本号
//	partner("partner"), // 渠道
//
//	chargeNum("chargeNum"), // 兑换金额
//	purcharseNum("purcharseNum"), // 消费金额
//	itemName("itemName"), // 购买道具名称
//	itemNum("itemNum"), // 购买道具数量
//	itemType("itemType"), // 购买道具类型
//
//	deviceType("deviceType"), // 设备类型
//	pix("pix"), // 设备分辨率
//	os("os"), // 设备操作系统版本
//	isp("isp"), // 网络运营商
//	channel("channel"), // 联网方式
//	country("country"), // 国家
//	area("area"), // 地区
//	timeHour("timeHour"), // 时间 小时 即0到24 各个小时的数据
//	;

	private String name;//查询的列名
	private String info;//查询的参数
	private String desc;
	private Node previousNode;
	private List<Node> nextNodes;

	public Node() {
		this(ConstString.END);
	}
	
	public Node(String name) {
		this(name, ConstString.ALL);
	}
	
	public Node(String name, String info) {
		this.name = name;
		this.info = info;
		this.nextNodes = new ArrayList<Node>();
	}
	
	
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (Node node : this.nextNodes) {
			sb.append(node.name+",");
		}
		return this.name+":"+this.info+":("+sb.toString()+")";
	}

	public Node addNextNode(Node next) {
		if(this.nextNodes == null)
			this.nextNodes = new ArrayList<Node>();
		this.nextNodes.add(next);
		return this;
	}
	
	public void getPath(Stack<String> stack, List<String> pathList) {
		stack.push(this.info + ConstString.SPLITER);
		if(this.nextNodes == null || this.nextNodes.size() == 0) {
			pathList.add(ConstString.SPLITER+stack.toString());
			stack.pop();
			return;
		} else {
			for(Node node : this.nextNodes) {
				node.getPath(stack, pathList);
			}
			stack.pop();
		}
			
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Node getPreviousNode() {
		return previousNode;
	}

	public void setPreviousNode(Node previousNode) {
		this.previousNode = previousNode;
	}

	public List<Node> getNextNodes() {
		return nextNodes;
	}

	public void setNextNodes(List<Node> nextNodes) {
		this.nextNodes = nextNodes;
	}

}
