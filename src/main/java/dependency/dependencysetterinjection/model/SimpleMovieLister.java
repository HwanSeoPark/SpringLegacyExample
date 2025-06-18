package dependency.dependencysetterinjection.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SimpleMovieLister {
	private MovieFinder movieFinder;

	public MovieFinder getMovieFinder() {
		return movieFinder;
	}

	// Setter 주입
	@Autowired
	public void setMovieFinder(MovieFinder movieFinder) {
		this.movieFinder = movieFinder;
	}
	
	public void printMovieList() {
		System.out.println(movieFinder.findAll());
	}
}
