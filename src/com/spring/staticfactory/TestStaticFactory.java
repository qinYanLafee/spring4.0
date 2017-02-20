package com.spring.staticfactory;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.spring.User;

public class TestStaticFactory {
	public static void main(String[] args) {
		//------------1.获取User对象-------
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/spring/staticfactory/bean-staticfactory.xml");
		User user = (User)context.getBean("staticFactory");
		System.out.println(user);
		
	}
}
