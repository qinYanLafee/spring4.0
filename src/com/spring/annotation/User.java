package com.spring.annotation;

import org.springframework.stereotype.Component;

@Component
public class User {
	private int id;
	private String name;
	public User(){
		System.out.println("--------���췽��--------");
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
		System.out.println("----��ʼ��------");
	}
	
	public void print(){
		System.out.println("��ӡ����");
	}
	
	public void B(){
		System.out.println("----���ٷ���------");
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
}
