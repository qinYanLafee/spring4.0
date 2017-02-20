package com.spring.aop.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyTest {
	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		//1.创建一个被代理对象
		ISum sum = new SumImpl();
		//2.创建一个代理对象处理器
		InvocationHandler handler = new ProxyHandler(sum);
		
		//3.创建代理对象
		ClassLoader loader = ISum.class.getClassLoader();
		Class[] interfaces = {ISum.class};
		ISum proxy = 
				(ISum)Proxy.newProxyInstance(loader, interfaces, handler);
		
		proxy.add(10, 20);
		proxy.sub(10,20);
		proxy.div(10,20);
		proxy.mut(10, 20);

	}

}
