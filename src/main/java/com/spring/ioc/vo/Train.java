package com.spring.ioc.vo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//bean生命周期中做些事情
public class Train implements InitializingBean,DisposableBean{
	//单例的bean在即将销毁前调用
	@Override
	public void destroy() throws Exception {
		//打个日志什么的
	}

	//在dogetbean的属性赋值之后做的事，初始化之前
	@Override
	public void afterPropertiesSet() throws Exception { 
		
	}

}
