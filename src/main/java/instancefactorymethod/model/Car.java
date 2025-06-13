package instancefactorymethod.model;

public class Car {
	private String brand;
	private String model;
	
	public Car(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}
	
	public void status() {
		System.out.println(brand + "의 " + model);
	}
}
