package com.spring.ioc.beanLifeCycle.beanPostProcessor;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
/**
 * �Գ�ʼ����ǰ������ǿ
 * @author pt -zhangxinxing
 *
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
	
	public MyBeanPostProcessor(){
		System.out.println("---MyBeanPostProcessor������---");
	}
	
	public void init(){
		System.out.println("---MyBeanPostProcessor��ʼ�����---");
	}
     /**
      * ��ʼ��ǰִ��
      */
	 @Override
	 public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		 System.out.println("----MyBeanPostProcessor��ʼ��ǰִ��postProcessBeforeInitialization----");	
		 return bean;
	 }
	 /**
      * ��ʼ����ִ��
      */
	 @Override
	 public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		 System.out.println("----MyBeanPostProcessor��ʼ����ִ��postProcessAfterInitialization----");		
		 return bean;
	 }
}
