package com.spring.ioc.componentScan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

import com.spring.ioc.vo.Dog;
/**
 * ɨ�����̣�refresh--invokeBeanFactoryPostProcessors--invokeBeanFactoryPostProcessors
 * --invokeBeanDefinitionRegistryPostProcessors--postProcessBeanDefinitionRegistry--
 * processConfigBeanDefinitions--parse--processConfigurationClass--doProcessConfigurationClass--
 * componentScanParser.parse--ClassPathBeanDefinitionScanner(componentScan.getBoolean("useDefaultFilters"), this.environment, this.resourceLoader))
 * --registerDefaultFilters--this.includeFilters.add(new AnnotationTypeFilter(Component.class));
 * @author pt -zhangxinxing
 *
 */
@Configuration//������   ���ȥ
//@ComponentScan(value="com.crbank.componentScan")//��ָ�������Ӱ��µ���ע������������������������е�bean��Ȼ����
@ComponentScan(value={"com.crbank.componentScan"},includeFilters={
				@Filter(type=FilterType.ANNOTATION,classes={Controller.class})
				//@Filter(type=FilterType.ASSIGNABLE_TYPE,classes={OrderController.class})
		        },
		        useDefaultFilters=false)//useDefaultFilters=true��ɨ�����б�conponentע��  ע��������ע��
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
