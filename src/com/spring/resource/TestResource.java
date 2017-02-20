package com.spring.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.spring.User;

public class TestResource {

	public static void main(String[] args) {
		//------------1.获取User对象-------
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/spring/resource/bean-resource.xml");
		
		ComboPooledDataSource dataSource = (ComboPooledDataSource)context.getBean("dataSource");
		System.out.println(dataSource);
	}

}
