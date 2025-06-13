package instancefactorymethod.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import instancefactorymethod.model.Car;
import instancefactorymethod.model.CarFactory;

@Configuration
public class AppConfig {

	// 1단계 : CarFactory Bean 먼저 생성
	@Bean
	public CarFactory carFactory() {
		return new CarFactory();
	}
	
	// 2단계 : CarFactory 인스턴스의 메서드 호출 -> Car 생성
	@Bean
	public Car car() {
		return carFactory().createCar(); // 인스턴스 팩토리 메서드
	}
}
