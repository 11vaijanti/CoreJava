package deepcopyconst;

public class Car {
	String brand;
	int price;
	Engine e;
	
	public Car(String brand, int price, Engine e) {
		this.brand = brand;
		this.price = price;
		this.e = e;
	}
	
	public Car(Car c) {
		this.brand = c.brand;
		this.price = c.price;
		this.e = new Engine();
	}
	
	public void copy() {
		System.out.println("brand :" + brand);
		System.out.println("price :" + price);
		System.out.println("==============" );
		System.out.println("engine type :" + e.type);
		System.out.println("engine power" + e.power);
	}
}
