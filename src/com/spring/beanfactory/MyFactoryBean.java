package com.spring.beanfactory;

import org.springframework.beans.factory.FactoryBean;

import com.spring.User;

public class MyFactoryBean implements FactoryBean<User> {
     private String name;
     private int id;
     private String password;
     private int age;
     
     public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	 }
     public void setName(String name) {
		this.name = name;
	 }
	
	/**
	 * 创建对象的方法
	 */
	@Override
	public User getObject() throws Exception {
		return new User(id,name,password,age);
	}

	/**
	 * 返回对象的类型
	 */
	@Override
	public Class<?> getObjectType() {
		return User.class;
	}

	/**
	 * 是否为单例
	 */
	@Override
	public boolean isSingleton() {
		return false;
	}

}
