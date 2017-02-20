package com.spring.instancefacotry;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.spring.User;

public class TestInstanceFactory {
	public static void main(String[] args) {
		//------------1.��ȡUser����-------
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/spring/instancefacotry/bean-instanefactory.xml");
		User user = (User)context.getBean("user");
		System.out.println(user);
		
	}
}
