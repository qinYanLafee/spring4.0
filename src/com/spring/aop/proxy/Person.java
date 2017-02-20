package com.spring.aop.proxy;

public class Person {
	
	public void rentHouse(ProxyHouse proxy){
		proxy.findHouse();
		double price = proxy.getPrice();
		if(price < 1000){
			System.out.println("-----------2.价格合适------------");
			System.out.println("-----------3.签合同------------");
			System.out.println("-----------4.付钱------------");
		}
	}
}
