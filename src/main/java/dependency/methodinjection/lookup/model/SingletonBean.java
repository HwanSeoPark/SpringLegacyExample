package dependency.methodinjection.lookup.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

	private PrototypeBean prototypeBean;
	
	@Autowired
	public SingletonBean(PrototypeBean prototypeBean) {
		this.prototypeBean = prototypeBean;
	}

	public void run() {
		prototypeBean.work();
	}
}
