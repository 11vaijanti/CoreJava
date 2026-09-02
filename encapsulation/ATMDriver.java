package encapsulation;

public class ATMDriver {

	public static void main(String[] args) {
		ATM a1 = new ATM("raju",200);
		
		System.out.println(a1.getName());
		System.out.println(a1.getBalance());
		a1.setName("vaiju");
		a1.setBalance(3999);
		System.out.println(a1.getName());
		System.out.println(a1.getBalance());
	}

}
