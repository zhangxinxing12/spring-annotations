import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.aop.Calculator;
import com.spring.ioc.autowiredQualifierPrimaryAndResource.config.AutowiredQualifierPrimaryAndResource;
/**
 * ��aopʱ�����Ŀ����ķ�����ʹ��aop��bean��Ҫ���������ǣ�����Ч
 * @author pt -zhangxinxing
 *
 */
public class TestAopAnnotation {
    @Test
	public void testMain(){
		ApplicationContext app = 
				new AnnotationConfigApplicationContext(com.spring.aop.config.AopConfig.class);
		System.out.println("-----Ioc xxx----");
		Calculator calculator = app.getBean(Calculator.class);
		int count = calculator.cal(8, 4);//AOP�ĵ���
	    System.out.println(count);
	    /*System.out.println("-----calculator�׳��쳣----");
		int count1 = calculator.cal(8, 0);
	    System.out.println(count1);*/
    }
	
}
