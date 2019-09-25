package com.spring.ioc.bean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.ioc.vo.Dog;

@Configuration//������
public class Configration {
	/**����ָ�����������ݷ�������ȡbeanId   
	 * AotuwirdҲ���ȸ�����������beanid��û�о͸������Ե�����
	 */
	@Bean//("dog")
 	public Dog getDog(){
		return new Dog();
	}
	
	@Bean("dog")
 	public Dog getDog1(){
		return new Dog(1,"����");
	}
}
