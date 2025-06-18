package dependency.autowiring.primary.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import dependency.autowiring.primary.service.*;

@Configuration
public class AppConfig {

	@Bean
//	@Primary // 기본 주입 대상 지정
	public EmailNotificationService emailNotificationService() {
		return new EmailNotificationService();
	}

	@Bean(autowireCandidate = false) // 타입 기반 autowiring 대상에서 제외됨 
	public SmsNotificationService smsNotificationService() {
		return new SmsNotificationService();
	}

	@Bean
	public UserService userService(/*@Qualifier("smsNotificationService")*/ NotificationService notificationService ) {
		return new UserService(notificationService);
	}
}
