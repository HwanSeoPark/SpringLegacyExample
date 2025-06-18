package dependency.usingdependson.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import dependency.usingdependson.service.LoggerInitializer;
import dependency.usingdependson.service.MyService;
import dependency.usingdependson.service.UserService;

@Configuration
public class AppConfig {

	@Bean
	@DependsOn({"loggerInitializer", "userService"}) // 두 빈이 먼저 초기화된 후 실행
	public MyService myService() {
		return new MyService();
	}
	
	@Bean
	@DependsOn("loggerInitializer") // loggerInitializer 빈이 먼저 초기화 된 후 실행
	public UserService userService() {
		return new UserService();
	}

	@Bean
	public LoggerInitializer loggerInitializer() {
		return new LoggerInitializer();
	}	
}
