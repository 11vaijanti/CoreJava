package Method;

public class ReverseNum {

	public static void main(String[] args) {
		int reverse = revNum(456);
		System.out.println(reverse);

	}
	public static int revNum(int num) {
		int rev = 0;
		while(num!=0) {
			rev = rev * 10 + num % 10; 
			num = num/10;
		}
		return rev;
	}

}
              