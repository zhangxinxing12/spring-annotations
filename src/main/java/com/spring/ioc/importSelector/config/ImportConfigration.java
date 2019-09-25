package com.spring.ioc.importSelector.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.spring.ioc.importBeanDefinitionRegistrar.MyImportBean;
import com.spring.ioc.importSelector.MyImportSelector;
import com.spring.ioc.vo.Dog;
import com.spring.ioc.vo.Person;

@Import({Dog.class/*,Person.class*/,MyImportSelector.class,MyImportBean.class})//��ʱ��beanId�����ȫ��
@Configuration//������
public class ImportConfigration {
	/**����ָ�����������ݷ�������ȡbeanId   
	 * AotuwirdҲ���ȸ�����������beanid��û�о͸������Ե�����
	 */
	/*@Bean//("dog")
 	public Person getDog(){
		return new Person();
	}*/
	
	/*@Bean("dog")
 	public Dog getDog1(){
		return new Dog(1,"����");
	}*/
}
