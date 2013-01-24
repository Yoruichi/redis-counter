package redis.tool;


public class Util {
	
	public static boolean strContainsStr(String checkStr, String subStr) {
		StringBuffer sb = new StringBuffer(checkStr);
		int i = sb.indexOf(subStr);
		if(i<0)
			return false;
		return true;
	}
	
	public static long strTolong(String str) {
		long info = 0;
		if (str != null && !"".equals(str)) {
			try {
				info = Long.parseLong(str);
			} catch (Exception e) {
				System.out.println("Util"+"strToLong"+"字符串转数字错误，带入字符串参数为："
						+ str + "，错误内容：" + e.getMessage());
			}
		}
		return info;
	}
	public static double strToDouble(String str) {
		double info = 0;
		if (str != null && !"".equals(str)) {
			try {
				info = Double.parseDouble(str);
			} catch (Exception e) {
				System.out.println("Util"+"strToDouble"+"字符串转数字错误，带入字符串参数为："
						+ str + "，错误内容：" + e.getMessage());
			}
		}
		return info;
	}
	public static int strToInt(String str) {
		int info = 0;
		if (str != null && !"".equals(str)) {
			try {
				info = Integer.parseInt(str);
			} catch (Exception e) {
				System.out.println("Util"+"strToInt"+"字符串转数字错误，带入字符串参数为："
						+ str + "，错误内容：" + e.getMessage());
			}
		}
		return info;
	}
	
	public static String intToString(int i) {
		return String.valueOf(i);
	}
	
}
