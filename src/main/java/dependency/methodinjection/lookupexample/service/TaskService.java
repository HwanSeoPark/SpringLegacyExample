package dependency.methodinjection.lookupexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class TaskService {

	public void run() {
		Task task = new Task(); // 매번 새로운 Task 인스턴스 생성
		task.execute();
	}
	
	@Lookup
	protected Task getTask() {
		 // Spring이 런타임에 이 메서드를 오버라이드하여 새로운 Task 인스턴스를 반환함
		return null;		
	}

//	 private ApplicationContext context;
//
//	    @Autowired
//	    public TaskService(ApplicationContext context) {
//	        this.context = context;
//	    }
//
//	    public void run() {
//	    	Task task = context.getBean(Task.class); // 매번 새 Bean 요청
//	        task.execute();
//	    }

//	private final Task task;
//
//    public TaskService(Task task) {
//        this.task = task;
//    }
//
//    public void run() {
//        task.execute();
//    }

}
