package com.spring.ioc.lazy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.spring.ioc.vo.Dog;

@Configuration
public class LazyConfig {
	
    /**
     * �����أ���Ե�ʵ��bean
     *         ��������ʱ���������󣬵��ҽ�����һ�λ�ȡbean�Ǵ�������
     * @return
     */
	//@Lazy
	@Bean
	public Dog dog(){
		return new Dog();
	}
}
