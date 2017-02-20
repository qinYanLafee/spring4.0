package com.spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.User;

public class TestAutoWire {

	public static void main(String[] args) {
		//------------1.获取User对象-------
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/spring/autowire/bean-autowrie.xml");
		User user = (User)context.getBean("user");
		System.out.println(user);
		User user1 = (User)context.getBean("user");
		System.out.println(user==user1);
		
	}

}
