package com.spring.aop;

import org.springframework.stereotype.Component;

/**
 * ����
 * @author pt -zhangxinxing
 * �������ҵ�񷽷�����־
 */
//@Component
public class Calculator {

	public Calculator(){
		System.out.println("---Calculator constuctor---");
	}
	public int cal(int i,int j){		
		System.out.println("-----cal------");
		return i/j;
	}
}
