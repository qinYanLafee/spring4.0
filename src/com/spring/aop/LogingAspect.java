package com.spring.aop;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Aspect //����Ϊ����
@Component //ע�뵽������
public class LogingAspect {
	
	/**@Before
	 * �����÷�����һ��ǰ��֪ͨ:��Ŀ�귽��֮ǰִ��
	 * execution(public void com.spring.aop.SumImpl.*(int,int))
	 * ��ǰ��֪ͨ�����ݼ��뵽Ŀ�귽�� 
	 * JoinPoint ���ӵ�
	 *      getSignature().getName() ��ȡĿ������еķ�����
	 *      getArgs() Ŀ�귽���Ĳ���ֵ
	 * @param joinPoint
	 */
	@Before("execution(public void com.spring.aop.SumImpl.*(int,int))")
	public void beforeMethod(JoinPoint joinPoint){
		System.out.println("����ִ��֮ǰ");
		String methodName = joinPoint.getSignature().getName();
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		System.out.println("methodName:"+methodName+",args:"+args);
	}
	
	@After("execution(public void com.spring.aop.SumImpl.*(int,int))")
	public void afterMethod(JoinPoint joinPoint){
		System.out.println("����ִ��֮��");
		String methodName = joinPoint.getSignature().getName();
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		System.out.println("methodName:"+methodName+",args:"+args);
	}
	


	@AfterThrowing(value="execution(public void com.spring.aop.SumImpl.*(int,int))",
			throwing="e")
	public void afterThrowingMethod(JoinPoint joinPoint,Exception e){
		System.out.println("�쳣����֮��"+e);
		//String methodName = joinPoint.getSignature().getName();
		//List<Object> args = Arrays.asList(joinPoint.getArgs());
		//System.out.println("methodName:"+methodName+",args:"+args);
	}

	

	@AfterReturning(value="execution(public void com.spring.aop.SumImpl.*(int,int))",
			returning="result")
	public void afterReturningMethod(JoinPoint joinPoint,Object result){
		System.out.println("����ִֵ��֮��"+result);
		//String methodName = joinPoint.getSignature().getName();
		//List<Object> args = Arrays.asList(joinPoint.getArgs());
		//System.out.println("methodName:"+methodName+",args:"+args);
	}
}
