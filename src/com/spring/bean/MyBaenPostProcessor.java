package com.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBaenPostProcessor implements BeanPostProcessor {
	
	/**
	 * ���췽��֮��,init����֮ǰ
	 * bean:�����Ķ���
	 * beanName: id
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("--------before-"+bean+","+beanName+"------");
		return bean;
	}

	/**
	 * init����֮��  ���󷽷�����֮ǰ��
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("--------after-"+bean+","+beanName+"------");
		return new String("abc");
	}

}
