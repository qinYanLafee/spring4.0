package com.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestAnnotation {
	
	public static void main(String[] args) {
		//1.加载配置文件
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/spring/annotation/bean-annotation.xml"); 
		//2.根据类型获取spring容器中的对象
		User user = context.getBean(User.class);
		System.out.println(user);
		
	}

}
