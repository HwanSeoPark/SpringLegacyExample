package defaultconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import defaultconstructor.config.AppConfig;
import defaultconstructor.service.MyService;

public class Main {
	public static void main(String... args) {
		
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
	}
}
