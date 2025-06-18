package dependency.autowiring.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dependency.autowiring.primary.service.UserService;
import dependency.autowiring.primary.config.AppConfig;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		UserService userService = context.getBean(UserService.class);
		userService.notifyUser();
	}
}
