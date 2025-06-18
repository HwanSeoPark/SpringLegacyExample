package dependency.dependencysetterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dependency.dependencysetterinjection.config.AppConfig;
import dependency.dependencysetterinjection.model.SimpleMovieLister;

public class Main {
	public static void main(String... args) {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);

		SimpleMovieLister movieLister = context.getBean(SimpleMovieLister.class);
		movieLister.printMovieList();
	}
}
