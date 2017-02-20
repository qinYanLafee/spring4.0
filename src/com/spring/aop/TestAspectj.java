package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAspectj {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("com/spring/aop/bean-aop.xml");
		ISum proxy = context.getBean(ISum.class);
		proxy.sub(10, 0);
		//proxy.div(10, 20);
	}

}
