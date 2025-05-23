package springiocquiz.quiz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springiocquiz.quiz.config.AppConfig;
import springiocquiz.quiz.model.Car;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppConfig.class);
	Car car	= (Car) context.getBean("car");
	
	car.start();			
	}
}
