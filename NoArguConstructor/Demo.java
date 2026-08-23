package NoArguConstructor;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
		s1.name = "raju";
		s1.roll = 10;
		System.out.println(s1.name);
		System.out.println(s1.roll);
		System.out.println("==========");
		
		Student s2 = new Student();
		s2.name = "sham";
		s2.roll =20;
		System.out.println(s2.name);
		System.out.println(s2.roll);
		
	}

}
