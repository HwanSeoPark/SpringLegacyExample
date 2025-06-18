package dependency.dependencyconstructorinjection.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dependency.dependencyconstructorinjection.model.MemoryMovieFinder;
import dependency.dependencyconstructorinjection.model.MovieFinder;
import dependency.dependencyconstructorinjection.model.MovieLister;

@Configuration
public class AppConfig {

	@Bean
	public MovieFinder movieFinder() {
		return new MemoryMovieFinder();
	}
	
	@Bean
	public MovieLister movieLister(MovieFinder movieFinder) {
		return new MovieLister(movieFinder);
	}	
}
