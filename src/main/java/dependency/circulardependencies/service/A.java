package dependency.circulardependencies.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class A {	
	private B b;

	@Autowired
	public A(@Lazy B b) {
		this.b = b;
	}	
}
