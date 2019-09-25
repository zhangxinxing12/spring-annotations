package com.spring.ioc.importBeanDefinitionRegistrar;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import com.spring.ioc.vo.Person;

public class MyImportBean implements ImportBeanDefinitionRegistrar {

	/**
	*AnnotationMetadata:��ǰ���ע����Ϣ
	*BeanDefinitionRegistry:BeanDefinitionע����
	*    ��������Ҫ��ӵ������е�bean����;
	*    @Scope
	*/
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		// TODO Auto-generated method stub
		RootBeanDefinition beanDefinition = new RootBeanDefinition(Person.class);
		registry.registerBeanDefinition("pig", beanDefinition);
	}

}
