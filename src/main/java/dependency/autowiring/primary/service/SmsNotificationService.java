package dependency.autowiring.primary.service;


public class SmsNotificationService implements NotificationService {
	@Override
	public void send(String message) {
		System.out.println("SMS : " + message);		
	}
}
