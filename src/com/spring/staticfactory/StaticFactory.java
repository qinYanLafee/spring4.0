package com.spring.staticfactory;

import java.util.HashMap;
import java.util.Map;

import com.spring.User;

public class StaticFactory {
	private static Map<String,User> users = new HashMap<String,User>();
	static{
		users.put("tom", new User(1,"tom","23",29));
		users.put("lily", new User(2,"lily","23",29));
		users.put("rose", new User(3,"rose","23",29));
	}
	
	public static User getUser(String name){
		return users.get(name);
	}
}
