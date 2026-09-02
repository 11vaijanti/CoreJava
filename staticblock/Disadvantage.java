package staticblock;

public class Disadvantage {
	
	static int a = 10; 

	public static void main(String[] args) {
	 Disadvantage d1 = new Disadvantage();
	 Disadvantage d2 = new Disadvantage();
	 d2.a = 100;
	 System.out.println(d1.a);     //100

	}

}


//When we call static member by creating object and try to make changes in that static member then it will make changes everywhere 