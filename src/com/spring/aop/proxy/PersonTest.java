package com.spring.aop.proxy;

public class PersonTest {

	public static void main(String[] args) {
		 //1.����һ���н����
		 ProxyHouse proxy = new ProxyHouse();
		 //2.����һ�����������
		 Person p = new Person();
		 p.rentHouse(proxy);
	}

}
