package dependency.autowiring.primary.service;

public class UserService {
	private NotificationService notificationService;

	public UserService(NotificationService notificationService) {
		this.notificationService = notificationService;
	}

	public void notifyUser() {
		notificationService.send("Hello from UserService");
	}
}
