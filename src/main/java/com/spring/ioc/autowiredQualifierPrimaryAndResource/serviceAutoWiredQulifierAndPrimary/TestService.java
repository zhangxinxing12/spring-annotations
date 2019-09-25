package com.spring.ioc.autowiredQualifierPrimaryAndResource.serviceAutoWiredQulifierAndPrimary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.spring.ioc.autowiredQualifierPrimaryAndResource.dao.TestDao;
/**
 * @Primary��@Qualifier������������@Autowired�ģ���ʾ���ȼ�
 * ��@Primaryһ����ȫ�����õ�bean��
 * �����ǰTestService��û�м�@Qualifier����ʹ�������ļ��м���@Primaryע����ĸ�bean
 * �����ǰTestService�м���@Qualifier����ʹ�������ļ��м���@@Qualifierע����ĸ�bean
 * @author pt -zhangxinxing
 *
 */
@Service
public class TestService {

	@Qualifier("testDao")//��@Autowired�����ȼ�Ҫ��
	@Autowired//���ȼ���ȫ�������ļ���@bean�ߣ�����beanId=testDao������û����������,����д�ڷ����ϺͲ���ǰ
	private TestDao testDao;
	
	public void print(){
		System.out.println(testDao);
	}
}
