package hasalazyinstantiation;

public class Car {
	String brand;
	int price;
	Engine e;
	
	public Car(String brand, int price) {
		this.brand = brand;
		this.price = price;
		
	}
	
	public void createEngine() {
		e = new Engine();
	}
	
}

//Lazy Instantiation : Create a method and call that method whenever you want the dependent object 