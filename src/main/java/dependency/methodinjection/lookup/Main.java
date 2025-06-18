package dependency.methodinjection.lookup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dependency.methodinjection.lookup.config.AppConfig;
import dependency.methodinjection.lookup.model.*;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
//
//		SingletonBean singletonBean = context.getBean(SingletonBean.class);
//		SingletonBean2 singletonBean2 = context.getBean(SingletonBean2.class);
		SingletonBean3 singletonBean3 = context.getBean(SingletonBean3.class);
		
		singletonBean3.run();
		singletonBean3.run();
		singletonBean3.run();
		singletonBean3.run();
		
	}
}
