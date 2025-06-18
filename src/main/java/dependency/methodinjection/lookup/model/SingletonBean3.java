package dependency.methodinjection.lookup.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public abstract class SingletonBean3 {

	public void run() {
		PrototypeBean bean = getPrototypeBean(); // 매번 새 Bean
		bean.work();
	}

	@Lookup
	protected PrototypeBean getPrototypeBean() {
		return null;
	}
}
