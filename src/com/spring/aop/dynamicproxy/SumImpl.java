package com.spring.aop.dynamicproxy;
/**
 * 日志:普通记录 
 * @author andy
 */
public class SumImpl implements ISum {

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
