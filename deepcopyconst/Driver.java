package deepcopyconst;

public class Driver {

	public static void main(String[] args) {
		Car c1 = new Car("TATA",20000, new Engine());		
		c1.copy();
		
		
		Car c2 = new Car(c1);
		c2.copy();
		
		c2.brand = "tesla";
		c1.copy();
		c2.copy();

	}

}
