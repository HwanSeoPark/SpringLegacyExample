package instancefactorymethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import instancefactorymethod.config.AppConfig;
import instancefactorymethod.model.Car;

public class Main {
	public static void main(String... args) {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);

		Car car = context.getBean(Car.class);
		car.status();
	}
}
