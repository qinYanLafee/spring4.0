package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mchange.v2.c3p0.DataSources;

public class TestSpring {

	public static void main(String[] args) {
		//--------------�ع� ��������-----------------
		User user = new User(1000,"jack","123456",20);
		int age = user.getAge();
		System.out.println(age);
		
		//---------------1.Spring���԰������Ǵ�������----------
		//1.���������ļ�
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.����bean id��ֵ��ȡ����
		/**
		 * ͨ��ID��ȡ
		 * Object getBean(String id)
		 */
		User u = (User)context.getBean("user");
		System.out.println(u);
		
		/**
		 * ͨ�����ͻ�ȡ
		 * Obejct getBean(Class cls)
		 */
		User u1 = context.getBean(User.class);
		System.out.println(u1);
		
		Object obj = context.getBean("pro");
		System.out.println(obj);
	}

}
