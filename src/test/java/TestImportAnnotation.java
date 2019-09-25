import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.ioc.importSelector.config.ImportConfigration;
import com.spring.ioc.vo.Dog;

public class TestImportAnnotation {

	public static void main(String[] args) {
		ApplicationContext app = 
				new AnnotationConfigApplicationContext(ImportConfigration.class);
		System.out.println("--����������--");
		
		String[] beanNames = app.getBeanDefinitionNames();
		for(String beanName:beanNames){
			System.out.println(Dog.class+"���beanId��:"+beanName);
			System.out.println(app.getBean(beanName));
		}		
	}

}
