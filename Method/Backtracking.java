package Method;

public class Backtracking {

	public static void main(String[] args) {
		System.out.println("main start");
		m1(5);
		System.out.println("m1 end");
	}
	public static void m1(int a) {
		if(a == 0) {
			return;
		}
		System.out.println("m1 start :" + a);
		m1(a-1);
		
		System.out.println("m1 end :" + a);
	}

}
