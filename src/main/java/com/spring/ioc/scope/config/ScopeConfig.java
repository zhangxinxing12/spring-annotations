package com.spring.ioc.scope.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.spring.ioc.vo.Dog;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;

@Configuration
public class ScopeConfig {
	/**
	 * ConfigurableBeanFactory.SCOPE_PROTOTYPE������������ÿ�α����òŴ���һ���µ�bean
	 * ConfigurableBeanFactory.SCOPE_SINGLETON����������ǰ�ʹ������ˣ����ŵ�������ȥ��
	 * WebApplicationContext.SCOPE_REQUEST
	 * WebApplicationContext.SCOPE_SESSION
	 * @return
	 */
    //@Scope("prototype")//��ʵ��
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	@Bean
	public Dog dog(){
		return new Dog();
	}
}
