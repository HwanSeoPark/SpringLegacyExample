package instancefactorymethod.model;

public class CarFactory {

	public CarFactory() {
		System.out.println("CarFactory 기본 생성자");
	}

	public Car createCar() {
		System.out.println("createCar() 호출");
		return new Car("현대", "산타페");
	}
}
