package dependency.circulardependencies.service;

import org.springframework.stereotype.Component;

@Component
public class B {
	private A a;
	
	public B(A a) {
		this.a = a;
	}
}
