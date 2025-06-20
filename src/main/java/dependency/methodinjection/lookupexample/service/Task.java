package dependency.methodinjection.lookupexample.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Task {
	
	public void execute() {
		System.out.println("Executing task");
	}
}
