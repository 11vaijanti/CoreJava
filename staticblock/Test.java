package staticblock;

public class Test {
	static int a = 10; //will access this static variable in demo class
	
	public static void main(String[] args) {
		int a = 20 ;
		System.out.println(a);            //20
	}
}
