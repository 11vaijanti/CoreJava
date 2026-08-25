package nonstaticmethod;

public class demo {
	//non static method
	public void m1() {
		System.out.println("non static method");
	}
	//static method
	public static void main(String[] args) {
		demo d = new demo();
		d.m1();
	}
}



//WE cant access non static methods directly in static methods
//If we want to access nonstatic methods inside static methods then we have to create object 
//we can access nonstatic methods inside nonstatic methods directly
