package sky.redis.core;

import java.util.ArrayList;
import java.util.List;

import redis.connect.tool.Util;
import redis.key.demo.ConstString;
import redis.tool.CreatLog;
import sky.redis.data.model.RCounter;
import sky.redis.data.model.RFilter;

public class KeyFactory {

	public static String toRedisKey(String key) {
		return Util.strToMd5(key);
	}

	public static List<String> getKeys(int command, RCounter counter) {
		List<String> pathList = new ArrayList<String>();
		String commandStr = "null";
		switch (command) {
		case ConstString.title:
			commandStr = "title";
			List<String> list = new ArrayList<String>();
			counter.processPath(list, counter.getTitle());
			for (String string : list) {
					pathList.add(counter.getName() + string);
			}
			break;
		case ConstString.excluded:
			commandStr = "excluded";
			list = new ArrayList<String>();
			counter.processPathFilter(list);
			for (String string : list) {
				pathList.add(string);
			}
			break;
		case ConstString.distinct:
			commandStr = "distinct";
			counter.processPath(pathList, counter.getMainTitle());
			List<String> temp = new ArrayList<String>();
			for (String string : pathList) {
				for (RFilter rf : counter.getDisTitle()) {
					temp.add(counter.getName() + string + rf.getName());
				}
			}
			pathList = temp;
			break;
		case ConstString.group:
			commandStr = "group";
			counter.processPath(pathList, counter.getMainTitle());
			temp = new ArrayList<String>();
			for (String string : pathList) {
				for (RFilter rf : counter.getGroupTitle()) {
					temp.add(counter.getName() + string + rf.getName());
				}
			}
			pathList = temp;
			break;
		case ConstString.main:
			commandStr = "main";
			list = new ArrayList<String>();
			counter.processPath(list, counter.getMainTitle());
			for (String string : list) {
				pathList.add(counter.getName() + string);
			}
			break;
		case ConstString.mainKey:
			commandStr = "mainKey";
			for (RFilter rf : counter.getMainTitle()) {
				pathList.add(counter.getName() + ConstString.SPLITER
						+ rf.getName());
			}
			break;
		case ConstString.groupKey:
			commandStr = "groupKey";
			counter.processPath(pathList, counter.getGroupTitle());
			break;
		}
//		CreatLog.setRedisInsertDebug(commandStr + "--->" + pathList
//				+ "\nkey's count:" + pathList.size());
		return pathList;
	}

}
