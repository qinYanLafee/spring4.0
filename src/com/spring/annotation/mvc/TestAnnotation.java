package com.spring.annotation.mvc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.annotation.mvc.controller.UserController;
public class TestAnnotation {
	
	public static void main(String[] args) {
		//1.加载配置文件
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/spring/annotation/mvc/bean-annotation.xml"); 
		//2.根据类型获取spring容器中的对象
		UserController controller = context.getBean(UserController.class);
		System.out.println(controller);
		controller.test();
		
	}

}
