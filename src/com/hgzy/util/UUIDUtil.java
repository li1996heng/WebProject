package com.hgzy.util;

import java.util.UUID;
/**
 * 生成32位随机的用户注册码
 * @author 李恒
 *
 */
public class UUIDUtil {
	public static String getUUID(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
}
