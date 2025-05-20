package springbeanexample.beancollision.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Bservice {

	private Aservice aservice;
	
	// Error creating bean with name 'bservice' : 
	//  Unsatisfied dependency expressed through constructor parameter 0: 
	//  No qualifying bean of type 'springbeanexample.beancollision.service.Aservice' available: 
	//         expected single matching bean but found 3: aservice1,aservice2,aservice3
	@Autowired
	public Bservice(/*@Qualifier("aservice1")*/Aservice aservice) {
		this.aservice = aservice;
	}	
}
