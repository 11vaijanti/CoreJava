package whileloop;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 123;
		int rev = 0;
		int copy = num;
		while(num !=0) {
			rev = rev * 10 + num % 10;
			num /= 10;
		}
		if(num == rev) {
			System.out.println("Given number is palindrome");
		}
		else {
			System.out.println("Given number is not a palindrome+");
		}

	}

}
