package com.spring.aop.proxy;

public class Person {
	
	public void rentHouse(ProxyHouse proxy){
		proxy.findHouse();
		double price = proxy.getPrice();
		if(price < 1000){
			System.out.println("-----------2.�۸����------------");
			System.out.println("-----------3.ǩ��ͬ------------");
			System.out.println("-----------4.��Ǯ------------");
		}
	}
}
