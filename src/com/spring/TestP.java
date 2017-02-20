package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mchange.v2.c3p0.DataSources;

public class TestP {

	public static void main(String[] args) {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("bean-p.xml");
		
		User user = (User)context.getBean("user");
		System.out.println(user);
	}

}
