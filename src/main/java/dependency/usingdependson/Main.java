package dependency.usingdependson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dependency.usingdependson.config.AppConfig;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context 
		= new AnnotationConfigApplicationContext(AppConfig.class);	
	}
}
