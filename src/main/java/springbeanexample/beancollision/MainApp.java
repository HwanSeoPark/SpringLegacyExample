package springbeanexample.beancollision;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springbeanexample.beancollision.config.AppConfig;
import springbeanexample.beancollision.service.Bservice;

public class MainApp {

	public static void main(String... args) {
		
		ApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppConfig.class);
		
		Bservice bservice = (Bservice) context.getBean("bservice");
		
		return;

	}
}
