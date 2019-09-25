package com.spring.ioc.autowiredQualifierPrimaryAndResource.controllerResourceAndInject;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spring.ioc.autowiredQualifierPrimaryAndResource.dao.TestDao;
import com.spring.ioc.autowiredQualifierPrimaryAndResource.serviceAutoWiredQulifierAndPrimary.TestService;
/**
 * @Resource��JDK-jsr250�ṩ�Ĺ淶
 * @author pt -zhangxinxing
 * @Resource��@AutowiredЧ��һ��������װ��bean
 * @Resource��֧��@Qulifier��@Primary
 * @Autowired��false�����ò���bean���ᱨ��
 */
@Controller
public class TestController {
 
	/**
	 * @Inject��Ҫ���������jar
	 * JDK-jsr330
	 * ��������@Autowired��ֻ��ȱ��@Autowired��false������
	 * ͬ�����Ա�@@Qulifier��@Primary����
	 */
	@Inject
	//@Resource(name="testDao2")
	private TestDao testDao;
	
	public void print(){
		System.out.println(testDao);
	}
}
