package com.spring.ioc.beanLifeCycle.jdkJSR250;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Jeep {

	public Jeep(){
		System.out.println("------Jeep�������------");
	}
	
	@PostConstruct
	public void init(){
		System.out.println("-----jeep��jdkע��@PostConstruct��ʼ��----");
	}
	@PreDestroy
	public void destory(){
		System.out.println("-----jeep��jdkע��@PostConstruct����----");
	}
}
