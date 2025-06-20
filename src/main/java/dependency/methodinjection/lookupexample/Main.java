package dependency.methodinjection.lookupexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dependency.methodinjection.lookupexample.config.AppConfig;
import dependency.methodinjection.lookupexample.service.TaskService;

public class Main {
	public static void main(String... args) {
		
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);

		TaskService taskService = context.getBean(TaskService.class);
						   
		taskService.run(); 
		                   
		taskService.run(); 
		                   		
		taskService.run(); 
		                 		
	}
}
