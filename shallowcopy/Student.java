package shallowcopy;

public class Student {
	String name;
	int roll;
	
	public Student(String name, int roll) {
		this.name = name;
		this.roll = roll;
		
	}
	public Student(Student s)  //creating another const and passing object as a parameter 
	{
		this.name = s.name; 
		this.roll = s.roll;
	}
	
	public void Info() {
		System.out.println("Name :" + name);
		System.out.println("roll :" + roll);
	}
}
