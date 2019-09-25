package com.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * ��־������@Aspect   @EnableAspectJAutoProxyʹ��aop�Ŀ���
 * @author pt -zhangxinxing
 *
 */
@Aspect
public class LogAspects {
    
	//execution   ������ ��public int div(int,int)  ����ʱ�ĸ�Ŀ����ķ�����com.crbank.aop.Calculator.div
	//@Before("execution(public int com.crbank.aop.Calculator.div(int,int))")
	//@Before("execution(public int com.crbank.aop.Calculator.*(..))")
	/*@Before("pointCut()")
	public void logStart(){
		System.out.println("---��������ǰ�Ƚ��в���У�飺@Before---");
	}*/
	//@After("execution(public int com.crbank.aop.Calculator.div(int,int))")
	/*@After("pointCut()")
	public void logEnd(){
		System.out.println("---����������@After---");
	}*/
	//@AfterReturning("execution(public int com.crbank.aop.Calculator.div(int,int))")
	/*@AfterReturning("pointCut()")
	public void logReturn(){
		System.out.println("---���������������أ�@AfterReturning����ǣ�{}---");
	}  */ 
	/**
	 * ע�⣺����ڻ���֪ͨʱץס�쳣���ͻ�����쳣
	 */
	//@AfterThrowing("execution(public int com.crbank.aop.Calculator.div(int,int))")
	/*@AfterThrowing("pointCut()")
	public void logExeception(){
		System.out.println("---���������쳣��@AfterThrowing---");
	}*/
	//@Around("execution(public int com.crbank.aop.Calculator.div(int,int))")
	@Around("pointCut()")
	public /*void*/Object logAround(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("---pre@Around---");
		Object obj = null;
		/*try {
			obj = joinPoint.proceed();
		} catch (Throwable e) {			
			e.printStackTrace();
		}*/
		obj = joinPoint.proceed();
		System.out.println("---next@Around---");
		return obj;
	}
	/**
	 * ���߶���һ���е㣬ֻдһ�����ʽ��������֪ͨ�����е�
	 * public int cal(int i,int j)
	 */
	@Pointcut("execution(public int com.spring.aop.Calculator.cal(..))")
	public void pointCut(){}
}
