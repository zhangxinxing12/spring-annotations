package com.spring.ioc.conditional;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class LinuxCondition implements Condition {
	
    /**
     * ConditionContext:�ж���������ʹ�õ������ģ�����������
     * AnnotatedTypeMetadata��ע�����Ϣ
     */
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		// TODO �Ƿ�Ϊlinux
		//�ܻ�ȡ��IOC��������ʹ�õ�BeanFactory
		ConfigurableListableBeanFactory configurableListableBeanFactory = 
				context.getBeanFactory();
		//��ȡ��ǰ�����������������ǵ��ԵĲ���ϵͳ��Linxu���������ģ�
		Environment environment = context.getEnvironment();
		String os_name = environment.getProperty("os.name");
		if(os_name.contains("Windows")){
			return true;
		}
		return false;
	}

}
