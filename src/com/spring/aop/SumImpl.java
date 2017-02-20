package com.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 日志:普通记录 
 * @author andy
 */
@Component //注入到容器中
public class SumImpl implements ISum {

	//声明该方法有一个前置通知:在目标方法之前执行
	@Override
	public void add(int i, int j) {
		int m =  i + j;
		System.out.println("-----add---------");
	}

	@Override
	public void div(int i, int j) {
		int m =  i - j;
		System.out.println("-----div---------");
	}

	@Override
	public void mut(int i, int j) {
		int m =  i * j;
		System.out.println("-----mut---------");
	}

	@Override
	public void sub(int i, int j) {
		int m =  i / j;
		System.out.println("-----sub---------");
	}

}
