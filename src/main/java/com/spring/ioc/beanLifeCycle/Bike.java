package com.spring.ioc.beanLifeCycle;

public class Bike {

	public Bike(){
		System.out.println("---�޲ι���Bike�����������---");
	}
	
	public void init(){
		System.out.println("---Bike��ʼ�����---");
	}
	
    public void destory(){
    	System.out.println("---Bike�ѱ�����---");
	}
}
