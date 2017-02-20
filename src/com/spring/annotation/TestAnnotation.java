package com.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestAnnotation {
	
	public static void main(String[] args) {
		//1.���������ļ�
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/spring/annotation/bean-annotation.xml"); 
		//2.�������ͻ�ȡspring�����еĶ���
		User user = context.getBean(User.class);
		System.out.println(user);
		
	}

}
