package com.tyyf.marriage.tools;

import java.util.UUID;

/**
 * UUID工具类
 * @author user
 *
 */
public final class UUIDUtil {
	/**
	 * 获取uuid
	 * @return
	 */
	public static String getUuid(){  
        UUID uuid = UUID.randomUUID();  
        String uuidStr =  uuid.toString();  
        uuidStr = uuidStr.replace("-", "");  
        return uuidStr;  
    }  
}
