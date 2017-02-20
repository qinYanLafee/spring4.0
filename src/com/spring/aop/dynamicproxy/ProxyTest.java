package com.spring.aop.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyTest {
	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		//1.����һ�����������
		ISum sum = new SumImpl();
		//2.����һ�������������
		InvocationHandler handler = new ProxyHandler(sum);
		
		//3.�����������
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
