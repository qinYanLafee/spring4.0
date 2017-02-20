package com.spring.aop.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/**
 * 动态代理的处理类
 * @author andy
 *
 */
public class ProxyHandler implements InvocationHandler {
	private ISum sum;
	public ProxyHandler(ISum sum) {
		this.sum = sum;
	}
	
	/**
	 * 修改目标方法的一个方法
	 * Object proxy:代理对象
	 * Method:被代理的方法
	 * Object[] 方法的参数值
	 * ISum sum = new SumImpl();
	 * sum.add(10,20);
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			{
		System.out.println("-----方法开始了------");
		//add方法之前
		Object rs = null;
		try {
			return rs = method.invoke(sum, args);
		} catch (Exception e) {
			System.out.println("----异常发生时---");
		}finally{
			System.out.println("----返回值执行之后--------");
		}
		
		//sum.add(10,20);
		System.out.println("-----方法结束了------");
		return rs;
	}

}
