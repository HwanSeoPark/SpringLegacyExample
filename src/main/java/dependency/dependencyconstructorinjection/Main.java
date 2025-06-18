package dependency.dependencyconstructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dependency.dependencyconstructorinjection.config.AppConfig;
import dependency.dependencyconstructorinjection.model.MovieLister;

public class Main {
	public static void main(String... args) {
	
	ApplicationContext context = 
    		new AnnotationConfigApplicationContext(AppConfig.class);

	MovieLister movieLister = context.getBean(MovieLister.class);
	movieLister.listMovie();
	}
}
