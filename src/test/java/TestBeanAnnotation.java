import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.ioc.bean.config.Configration;
import com.spring.ioc.vo.Dog;

public class TestBeanAnnotation {

	public static void main(String[] args) {
		ApplicationContext app = 
				new AnnotationConfigApplicationContext(Configration.class);
		System.out.println("--����������--");
		/**
		 * Exception in thread "main" 
		 * org.springframework.beans.factory.NoSuchBeanDefinitionException:
		 *   No bean named 'dog' available
		 */
		//Dog dog = (Dog)app.getBean("dog");//����ᱨ������쳣��ԭ��  û��  dog���beanId
		Dog dog = (Dog)app.getBean("getDog");//@BeanĬ�ϵ�����
		Dog dog1 = (Dog)app.getBean("dog");//@Beanָ��������
		String[] beanNames = app.getBeanNamesForType(Dog.class);
		for(String beanName:beanNames){
			System.out.println(Dog.class+"���beanId��:"+beanName);
		}
		
		System.out.println(dog);
		System.out.println(dog1);//���ö����toString����
	}

}
