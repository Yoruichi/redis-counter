package sky.redis.data.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import redis.key.demo.ConstString;
import redis.key.demo.Stack;

public class RCounter {

	/*
	 * version sky
	 */
	private String name;
	private RCounted counted;
	private List<RFilter> title = new ArrayList<RFilter>();
	private List<RFilter> mainTitle = new ArrayList<RFilter>();
	private List<RFilter> disTitle = new ArrayList<RFilter>();
	private List<RFilter> groupTitle = new ArrayList<RFilter>();
	private List<RFilter> ttlTitle = new ArrayList<RFilter>();
	private int ttl = 60 * 60 * 60;//60小时过期
	private String ttlSign = "XttlX:";

	/*
	 * version hope
	 */
	private List<RFilter> excludedTitle = new ArrayList<RFilter>();

	public RCounter() {
	};

	public RCounter(String name) {
		this.setName(name);
	}

	public RFilter getRFilter(String name) {
		for (RFilter r : this.title) {
			if (r.getName().equals(name))
				return r;
		}
		return null;
	}

	public RFilter getGroupRFilter(String name) {
		for (RFilter r : this.groupTitle) {
			if (r.getName().equals(name))
				return r;
		}
		return null;
	}

	public RFilter getMainRFilter(String name) {
		for (RFilter r : this.mainTitle) {
			if (r.getName().equals(name))
				return r;
		}
		return null;
	}

	public boolean contains(RFilter rf) {
		for (RFilter r : this.title) {
			if (r.getName().equals(rf.getName()))
				return true;
		}
		return false;
	}

	public boolean isCounted(String name) {
		return counted.getName().equals(name);
	}

	public String toRedisValue() {
		String str = "";
		try {
			str = new ObjectMapper().writeValueAsString(this);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.getName() + "\n");
		sb.append("filters:|");
		for (int i = 0; i < getTitle().size(); i++) {
			sb.append(getTitle().get(i).getName() + "|\t");
		}
		if (mainTitle.size() > 0) {
			sb.append("\nmain filters:|");
			for (int i = 0; i < getMainTitle().size(); i++) {
				sb.append(getMainTitle().get(i).getName() + "|\t");
			}
		} else {
			sb.append("\nno main filter define.");
		}
		if (groupTitle.size() > 0) {
			sb.append("\ngroup filters:|");
			for (int i = 0; i < getGroupTitle().size(); i++) {
				sb.append(getGroupTitle().get(i).getName() + "|\t");
			}
		} else {
			sb.append("\nno group filter define.");
		}
		if (disTitle.size() > 0) {
			sb.append("\ndistinct filters:|");
			for (int i = 0; i < getDisTitle().size(); i++) {
				sb.append(getDisTitle().get(i).getName() + "|\t");
			}
		} else {
			sb.append("\nno distinct filter define.");
		}
		if (ttlTitle.size() > 0) {
			sb.append("\nttl filters:|");
			for (int i = 0; i < getDisTitle().size(); i++) {
				sb.append(getTtlTitle().get(i).getName() + "|\t");
			}
			sb.append("\nttl time:" + ttl / 3600);
			sb.append("\nttl sign:"
					+ ttlSign.substring(0, ttlSign.length() - 1));
		} else {
			sb.append("\nno ttl filter define.");
		}
		sb.append("\ncounted:" + counted.getName());
		return sb.toString();
	}

	public List<RFilter> getTitle() {
		return title;
	}

	public void setTitle(List<RFilter> title) {
		this.title = title;
	}

	public void setFilterFinal(List<RFilter> title) {
		Collections.sort(title);
		for (int i = title.size() - 2; i >= 0; i--) {
			if (title.get(i).isDistinct() | title.get(i + 1).isDistinct()) {
				continue;
			}
			title.get(i).addChild(title.get(i + 1));
		}
	}

	public void processPath(List<String> pathList, List<RFilter> title) {
		Stack<String> stack = new Stack<String>();
		RFilter head = title.get(0);
		if (head != null)
			head.getPath(stack, pathList);
	}

	public void processPathFilter(List<String> pathList) {
		if (excludedTitle.size() == 0)
			return;
		for (int j = 0; j < excludedTitle.size(); j++) {
			StringBuffer sb = new StringBuffer();
			for (String string : excludedTitle.get(j).getInfo()) {
				sb.delete(0, sb.length());
				sb.append(ConstString.SPLITER);
				for (int i = 0; i < excludedTitle.size(); i++)
					if (i == j)
						sb.append(excludedTitle.get(i).getIndex() + string
								+ ConstString.SPLITER);
					else
						sb.append(excludedTitle.get(i).getIndex()
								+ ConstString.ALL + ConstString.SPLITER);
				if (!pathList.contains(sb.toString()))
					pathList.add(sb.toString());
			}
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<RFilter> getMainTitle() {
		return mainTitle;
	}

	public List<RFilter> getDisTitle() {
		return disTitle;
	}

	public List<RFilter> getGroupTitle() {
		return groupTitle;
	}

	public void setMainTitle(List<RFilter> mainTitle) {
		this.mainTitle = mainTitle;
	}

	public void setMainTitleFinal() {

		for (RFilter rf : mainTitle) {
			getRFilter(rf.getName()).setMain(true);
			rf.setIndex(getRFilter(rf.getName()).getIndex());
		}
	}

	public void setDisTitle(List<RFilter> disTitle) {
		this.disTitle = disTitle;
	}

	public void setDisTitleFinal() {
		for (RFilter rf : disTitle) {
			getRFilter(rf.getName()).setDistinct(true);
			rf.setIndex(getRFilter(rf.getName()).getIndex());
		}
	}

	public void setGroupTitle(List<RFilter> groupTitle) {
		this.groupTitle = groupTitle;
	}

	public void setGroupTitleFinal() {
		for (RFilter rf : groupTitle) {
			getRFilter(rf.getName()).setGroup(true);
			rf.setIndex(getRFilter(rf.getName()).getIndex());
		}
	}

	public void setTtlTitleFinal() {
		for (RFilter rf : ttlTitle) {
			getRFilter(rf.getName()).setTtl(true);
			rf.setIndex(getRFilter(rf.getName()).getIndex());
		}
	}

	public RCounted getCounted() {
		return counted;
	}

	public void setCounted(RCounted counted) {
		this.counted = counted;
	}

	public void setInfoFinal(List<RFilter> list) {
		for (RFilter rf : list) {
			if (isDistinctFilter(rf.getName()))
				continue;
			rf.setInfoFinal();
		}
	}

	public boolean isGroupFilter(String string) {
		for (RFilter rf : groupTitle) {
			if (rf.getName().equals(string))
				return true;
		}
		return false;
	}

	public boolean isMainFilter(String string) {
		for (RFilter rf : mainTitle) {
			if (rf.getName().equals(string))
				return true;
		}
		return false;
	}

	public boolean isTtlFilter(String string) {
		for (RFilter rf : ttlTitle) {
			if (rf.getName().equals(string))
				return true;
		}
		return false;
	}

	public boolean isDistinctFilter(String string) {
		for (RFilter rf : disTitle) {
			if (rf.getName().equals(string))
				return true;
		}
		return false;
	}

	public int getTtl() {
		return ttl;
	}

	public void setTtl(int ttl) {
		this.ttl = ttl;
	}

	public String getTtlSign() {
		return ttlSign;
	}

	public void setTtlSign(String ttlSign) {
		this.ttlSign = ttlSign;
	}

	public List<RFilter> getTtlTitle() {
		return ttlTitle;
	}

	public void setTtlTitle(List<RFilter> ttlTitle) {
		this.ttlTitle = ttlTitle;
	}

	public List<RFilter> getExcludedTitle() {
		return excludedTitle;
	}

	public void setExcludedTitle(List<RFilter> excludedTitle) {
		this.excludedTitle = excludedTitle;
	}

	public void setExcludedTitleFinal() {
		for (RFilter rf : excludedTitle) {
			rf.setIndex(getRFilter(rf.getName()).getIndex());
		}
	}

}
