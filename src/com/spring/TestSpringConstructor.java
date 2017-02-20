package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringConstructor {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("bean-consturctor.xml");
		User user = (User)context.getBean("user");
		System.out.println(user);
		
		User user1 = (User)context.getBean("user1");
		System.out.println(user1);
	}

}
