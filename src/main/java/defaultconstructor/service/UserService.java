package defaultconstructor.service;

import org.springframework.stereotype.Component;

@Component
public class UserService {
	// 디폴트 생성자는 생성자가 없을 경우 컴파일러가 자동으로 생성해줌
	public UserService() {
		System.out.println("UserService의 디폴트 생성자!!");
	}
}
