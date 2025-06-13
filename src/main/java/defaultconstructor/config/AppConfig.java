package defaultconstructor.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import defaultconstructor.service.MyService;

@Configuration
@ComponentScan(basePackages ="package defaultconstructor.service")
public class AppConfig {

	@Bean
	public MyService myService() {
		return new MyService();
	}
}
