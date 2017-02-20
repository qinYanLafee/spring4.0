package com.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * ��־:��ͨ��¼ 
 * @author andy
 */
@Component //ע�뵽������
public class SumImpl implements ISum {

	//�����÷�����һ��ǰ��֪ͨ:��Ŀ�귽��֮ǰִ��
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
