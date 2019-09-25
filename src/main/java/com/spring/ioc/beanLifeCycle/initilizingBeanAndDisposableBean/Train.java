package com.spring.ioc.beanLifeCycle.initilizingBeanAndDisposableBean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Train implements InitializingBean, DisposableBean {

	public Train(){
		System.out.println("train���������");
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("----destroy-----");
	}
    //������ֵ�ͳ�ʼ�����ʱ����
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
        System.out.println("----afterPropertiesSet-----");
	}

}
