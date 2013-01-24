package redis.connect.tool;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

public class Util {

	/*
	 * get random UUID which has been deleted "-"
	 * get UUID's length is 32
	 */
	public static String getUUID() {
		UUID uuid = UUID.randomUUID();
		String[] type = uuid.toString().split("-");
		StringBuffer sbu = new StringBuffer();
		for (String string : type) {
			sbu = sbu.append(string);
		}
		return sbu.toString();
	}

    /**  
     * 将字符串装换为MD5  
     * @param str  
     * @return  
     */ 
	public static String strToMd5(String str) {  
        String md5Str = null;  
        if (str != null && str.length() != 0) {  
            try {  
                MessageDigest md = MessageDigest.getInstance("MD5");  
                md.update(str.getBytes());  
                byte b[] = md.digest();  
                  
                int i;  
                StringBuffer buf = new StringBuffer("");  
                for (int offset = 0; offset < b.length; offset++) {  
                    i = b[offset];  
                    if (i < 0)  
                        i += 256;  
                    if (i < 16)  
                        buf.append("0");  
                    buf.append(Integer.toHexString(i));  
                }  
                //32位  
                //md5Str = buf.toString();  
                //16位  
                md5Str = buf.toString().substring(8, 24);  
            } catch (NoSuchAlgorithmException e) {  
                e.printStackTrace();  
            }  
        }  
        return md5Str;  
    }  
	
}
