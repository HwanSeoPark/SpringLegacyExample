package staticfactorymethod.service;

public class StaticService { 
	
	// private 설정 이유
	// 직접 생성 못하게 막고, 정적 팩토리 메서드로만 인스턴스 생성하게 하기 위함
	private StaticService() {
		System.out.println("(private)디폴트 생성자 호출");
	}
	
	public static StaticService service() {
		System.out.println("정적 팩토리 메서드");
		return new StaticService();		
	}
}
