package com.spring.aop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.spring.aop.Calculator;
import com.spring.aop.LogAspects;
/**
 * ��־������ķ����࣬Ҫ��̬֪ͨ�� ��Ӧ��Ŀ�����ҵ�񷽷�������
 * @author pt -zhangxinxing
 * ֪ͨ������//������
 *     ǰ��֪ͨ��logStart();��ִ��cal()����֮ǰ����(@Before)
 *     ����֪ͨ��logEnd();  (@After)
 *     ����֪ͨ��logAround();��Ҫ�ֶ�ִ��joinPoint.procced()--Ŀ�귽��(@Around)
 *     �쳣֪ͨ��logExecption():��ִ��cal()�����쳣ʱ֪ͨ(@AfterThrowing)
 *     ����֪ͨ��logReturn();(@AfterReturning)
 */
@Configuration
@EnableAspectJAutoProxy
//@ComponentScan("com.crbank.aop")
public class AopConfig {

	@Bean
	public Calculator calculator(){
		return new Calculator();
	}
	
	@Bean
	public LogAspects logAspects(){
		return new LogAspects();
	}
}
