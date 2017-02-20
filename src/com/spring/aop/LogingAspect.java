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
@Aspect //定义为切面
@Component //注入到容器中
public class LogingAspect {
	
	/**@Before
	 * 声明该方法是一个前置通知:在目标方法之前执行
	 * execution(public void com.spring.aop.SumImpl.*(int,int))
	 * 将前置通知的内容加入到目标方法 
	 * JoinPoint 连接点
	 *      getSignature().getName() 获取目标对象中的方法名
	 *      getArgs() 目标方法的参数值
	 * @param joinPoint
	 */
	@Before("execution(public void com.spring.aop.SumImpl.*(int,int))")
	public void beforeMethod(JoinPoint joinPoint){
		System.out.println("方法执行之前");
		String methodName = joinPoint.getSignature().getName();
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		System.out.println("methodName:"+methodName+",args:"+args);
	}
	
	@After("execution(public void com.spring.aop.SumImpl.*(int,int))")
	public void afterMethod(JoinPoint joinPoint){
		System.out.println("方法执行之后");
		String methodName = joinPoint.getSignature().getName();
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		System.out.println("methodName:"+methodName+",args:"+args);
	}
	


	@AfterThrowing(value="execution(public void com.spring.aop.SumImpl.*(int,int))",
			throwing="e")
	public void afterThrowingMethod(JoinPoint joinPoint,Exception e){
		System.out.println("异常发生之后"+e);
		//String methodName = joinPoint.getSignature().getName();
		//List<Object> args = Arrays.asList(joinPoint.getArgs());
		//System.out.println("methodName:"+methodName+",args:"+args);
	}

	

	@AfterReturning(value="execution(public void com.spring.aop.SumImpl.*(int,int))",
			returning="result")
	public void afterReturningMethod(JoinPoint joinPoint,Object result){
		System.out.println("返回值执行之后"+result);
		//String methodName = joinPoint.getSignature().getName();
		//List<Object> args = Arrays.asList(joinPoint.getArgs());
		//System.out.println("methodName:"+methodName+",args:"+args);
	}
}
