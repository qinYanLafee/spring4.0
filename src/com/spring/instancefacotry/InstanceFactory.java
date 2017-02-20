package com.spring.instancefacotry;

import java.util.HashMap;
import java.util.Map;

import com.spring.User;

public class InstanceFactory {
	private  Map<String,User> users ;
	public InstanceFactory(){
		users = new HashMap<String,User>();
		users.put("tom", new User(1,"tom","23",29));
		users.put("lily", new User(2,"lily","23",29));
		users.put("rose", new User(3,"rose","23",29));
	}
	
	public  User getUser(String name){
		return users.get(name);
	}
}
