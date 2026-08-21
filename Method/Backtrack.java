package Method;

public class Backtrack {

	public static void main(String[] args) {
		m1(5);

	}
	public static void m1(int a) {
		if(a==0) {
			return;
		}
		m1(a-1);
		System.out.println(a);
	}

}
