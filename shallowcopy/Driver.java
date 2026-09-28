package shallowcopy;

public class Driver {

	public static void main(String[] args) {
		Student s1 = new Student("raju",12);
		s1.Info();
		System.out.println("=========");
		
		Student s2 = new Student(s1);
		s2.Info();
		System.out.println("=========");
		
		s2.name = "maya";     
		s2.Info();
		System.out.println("=========");
		
		s1.Info();
	}

}
