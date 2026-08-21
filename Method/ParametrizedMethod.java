package Method;

public class ParametrizedMethod {
	public static void main(String[] args) {
		add(10,20);
		add(38,28);
		substract(8,3);
		division(50,5);
		
	}
	public static void add(int a, int b) {
		System.out.println("Add :"+(a+b));
	}
	public static void substract(int c, int d) {
		System.out.println("Sub :"+(c-d));
	}
	public static void multiplication(int m, int n) {
		System.out.println("Multi :"+(m*n));
	}
	public static void division(int u, int v) {
		System.out.println("Div :"+(u/v));
	}

}
