package com.spring.aop.proxy;

public class PersonTest {

	public static void main(String[] args) {
		 //1.创建一个中介对象
		 ProxyHouse proxy = new ProxyHouse();
		 //2.创建一个被代理对象
		 Person p = new Person();
		 p.rentHouse(proxy);
	}

}
