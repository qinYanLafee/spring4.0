package com.spring.bean;

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
	
	public void A(){
		System.out.println("----初始化------");
	}
	
	public void print(){
		System.out.println("打印方法");
	}
	
	public void B(){
		System.out.println("----销毁方法------");
	}
}
