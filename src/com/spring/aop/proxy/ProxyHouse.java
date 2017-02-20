package com.spring.aop.proxy;

public class ProxyHouse {
	//1.找房子
	public void findHouse(){
		System.out.println("-------找到合适房子-------");
	}
	//2.谈价格
	public double getPrice(){
		return 800;
	}

}
