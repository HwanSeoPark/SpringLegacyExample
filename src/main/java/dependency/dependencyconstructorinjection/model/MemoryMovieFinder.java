package dependency.dependencyconstructorinjection.model;

import java.util.ArrayList;
import java.util.List;

public class MemoryMovieFinder implements MovieFinder {
	@Override
	public List<String> findAll() {
		List<String> movieList = new ArrayList<>();
		movieList.add("Inception");
		movieList.add("Interstellar");
		movieList.add("Harry Poter");
		return movieList; 
	}
}
