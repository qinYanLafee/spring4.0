package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mchange.v2.c3p0.DataSources;

public class TestSpring {

	public static void main(String[] args) {
		//--------------回顾 创建对象-----------------
		User user = new User(1000,"jack","123456",20);
		int age = user.getAge();
		System.out.println(age);
		
		//---------------1.Spring可以帮助我们创建对象----------
		//1.加载配置文件
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.根据bean id的值获取对象
		/**
		 * 通过ID获取
		 * Object getBean(String id)
		 */
		User u = (User)context.getBean("user");
		System.out.println(u);
		
		/**
		 * 通过类型获取
		 * Obejct getBean(Class cls)
		 */
		User u1 = context.getBean(User.class);
		System.out.println(u1);
		
		Object obj = context.getBean("pro");
		System.out.println(obj);
	}

}
