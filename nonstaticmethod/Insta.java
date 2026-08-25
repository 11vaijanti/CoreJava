package nonstaticmethod;

public class Insta {

	public static void main(String[] args) {
		User u1 = new User("raju@12", "raju@gmail.com" , 123, "paisa hi paisa");
		/* Now we dont have to write all printing statements like we did in thiscallstatement package and constructoroverloading
		   Cause we created nonstatic method in user class and now we have to call that method only
		*/
		u1.printInfo();
		
		System.out.println("=============");
		
		User u2 = new User("sham@12", "sham@gmail.com" ,456);
		u2.printInfo();
		
		System.out.println("=============");
		
		User u3 = new User("babu@12", 789);
		u3.printInfo();

	}

}
