package dependency.dependencysetterinjection.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class InMemoryMovieFinder implements MovieFinder {

	@Override
	public List<String> findAll() {
		List<String> list = new ArrayList<>();
		list.add("Harry Potter");
		list.add("Inception");
		list.add("Interstellar");
		return list;
	}
}
