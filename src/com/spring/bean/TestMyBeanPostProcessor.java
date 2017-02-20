package com.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.User;

public class TestMyBeanPostProcessor {

	public static void main(String[] args) {
		//------------1.获取User对象-------
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("com/spring/bean/bean.xml");
		/*User user = (User)context.getBean("user");
		user.print();*/
		Object obj = context.getBean("user");
		System.out.println(obj);
	}
	

}
