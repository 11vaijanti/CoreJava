package hasarelation;

public class Car {
	String brand;
	int price;
	
	Engine e = new Engine();
	
	public Car(String brand,int price) {
		this.brand = brand;
		this.price = price;
	}
}
