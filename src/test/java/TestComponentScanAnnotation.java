import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.ioc.componentScan.config.Configration;

public class TestComponentScanAnnotation {

	@Test
	public void testMain(){
		ApplicationContext app = 
				new AnnotationConfigApplicationContext(Configration.class);
		System.out.println("--����������--");
		//�õ������е�����beanId �� ����beanId
		String[] beanNames = app.getBeanDefinitionNames();
		for(String beanName:beanNames){
			System.out.println(beanName);
		}
	}

}
