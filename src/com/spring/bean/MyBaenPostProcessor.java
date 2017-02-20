package com.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBaenPostProcessor implements BeanPostProcessor {
	
	/**
	 * 构造方法之后,init方法之前
	 * bean:创建的对象
	 * beanName: id
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("--------before-"+bean+","+beanName+"------");
		return bean;
	}

	/**
	 * init方法之后  对象方法调用之前。
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("--------after-"+bean+","+beanName+"------");
		return new String("abc");
	}

}
