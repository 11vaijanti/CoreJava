package thiscallstatement;

public class Insta {

	public static void main(String[] args) {
		User u1 = new User("raju@12",123,"raju@gmail.com","paisa hi paisa");
		System.out.println(u1.UID);
		System.out.println(u1.password);
		System.out.println(u1.email);
		System.out.println(u1.bio);
		
		System.out.println("=============");
		
		User u2 = new User("sham@12",123,"sham@gmail.com");
		System.out.println(u2.UID);
		System.out.println(u2.password);
		System.out.println(u2.email);
		System.out.println(u2.bio);
		
		System.out.println("=============");
		
		User u3 = new User("babu@12",123);
		System.out.println(u3.UID);
		System.out.println(u3.password);
		System.out.println(u3.email);
		System.out.println(u3.bio);
	}

}
