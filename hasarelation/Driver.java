package hasarelation;

public class Driver {

	public static void main(String[] args) {
		Car c1 = new Car("Tesla", 20000);
		System.out.println(c1.brand);
		System.out.println(c1.price);
		System.out.println(c1.e.type);
		System.out.println(c1.e.power);
		
	}

}
