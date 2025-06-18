package dependency.methodinjection.lookup.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeBean {

	public PrototypeBean() {
		System.out.println("🔄 PrototypeBean 생성!!");
	}

	public void work() {
		System.out.println("⏩ 일 하는 중");
	}
}
