package Factorymethod;

public class Demodriver {

	public static void main(String[] args) {
		Demo d1 = Demo.getObject();
		Demo d2 = Demo.getObject();
		System.out.println(d1); 
		System.out.println(d2);
		

	}

}
