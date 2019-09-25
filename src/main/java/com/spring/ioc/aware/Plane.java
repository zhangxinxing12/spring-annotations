package com.spring.ioc.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
/**
 * aware����Щ�ӿڶ����ں��ô��������жϲ��õ�set�еĲ�����
 * ͨ��ʵ��aware�ӿڣ��õ���Ӧ��bean
 * @author pt -zhangxinxing
 *
 */
public class Plane implements ApplicationContextAware {

	private ApplicationContext applicationContext;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

}
