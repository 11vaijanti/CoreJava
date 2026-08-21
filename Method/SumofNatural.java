// Using recursion
package Method;

public class SumofNatural {

	public static void main(String[] args) {
		//int sum1 = sum(3);
		System.out.println(sum(3));
		

	}
	public static int sum(int a) {
		if(a==1) {
			return 1;
		}
		return a + sum(a-1);
	
	}
}
