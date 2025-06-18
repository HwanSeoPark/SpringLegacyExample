package dependency.dependencyconstructorinjection.model;

import java.util.List;

public class MovieLister {

	private MovieFinder movieFinder;
	
	public MovieLister() {}
	
	// 생성자 기반 DI
	public MovieLister(MovieFinder movieFinder) {
		this.movieFinder = movieFinder;
	}
	
	public void listMovie() {
		System.out.println(movieFinder.findAll());
	}	
}
