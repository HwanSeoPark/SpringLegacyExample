package staticfactorymethod.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import staticfactorymethod.service.StaticService;

@Configuration
public class AppConfig {

	@Bean
	public StaticService staticService() {
		return StaticService.service(); // new 키워드 생략
	}
}
