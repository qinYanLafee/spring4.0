package com.spring.annotation.mvc.entity;

import org.springframework.stereotype.Component;

@Component("u1")
public class User {
	private int id;
	private String name;
	public User(){
		System.out.println("--------构造方法--------");
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
}
