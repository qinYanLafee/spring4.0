package com.spring.aop.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/**
 * ��̬����Ĵ�����
 * @author andy
 *
 */
public class ProxyHandler implements InvocationHandler {
	private ISum sum;
	public ProxyHandler(ISum sum) {
		this.sum = sum;
	}
	
	/**
	 * �޸�Ŀ�귽����һ������
	 * Object proxy:�������
	 * Method:������ķ���
	 * Object[] �����Ĳ���ֵ
	 * ISum sum = new SumImpl();
	 * sum.add(10,20);
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			{
		System.out.println("-----������ʼ��------");
		//add����֮ǰ
		Object rs = null;
		try {
			return rs = method.invoke(sum, args);
		} catch (Exception e) {
			System.out.println("----�쳣����ʱ---");
		}finally{
			System.out.println("----����ִֵ��֮��--------");
		}
		
		//sum.add(10,20);
		System.out.println("-----����������------");
		return rs;
	}

}
