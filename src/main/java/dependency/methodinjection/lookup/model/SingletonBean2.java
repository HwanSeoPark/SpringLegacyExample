package dependency.methodinjection.lookup.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SingletonBean2 {

    private ApplicationContext context;

    @Autowired
    public SingletonBean2(ApplicationContext context) {
        this.context = context;
    }

    public void run() {
        PrototypeBean bean = context.getBean(PrototypeBean.class); // 매번 새 Bean 요청
        bean.work();
    }
}
