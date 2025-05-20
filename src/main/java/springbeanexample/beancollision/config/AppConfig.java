package springbeanexample.beancollision.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import springbeanexample.beancollision.service.Aservice;

@Configuration
@ComponentScan({"springbeanexample.beancollision"})
public class AppConfig {
	
	

	@Bean
	public Aservice aservice1() {
		return new Aservice();
	}
	
	@Bean
	@Primary
	public Aservice aservice2() {
		return new Aservice();
	}
	
	@Bean
	public Aservice aservice3() {
		return new Aservice();
	}
	
	
}
