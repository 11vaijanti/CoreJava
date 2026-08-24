package thiskeyword;
//Cant write this keyword in static method
//used to access nonstatic  variable
public class Student {
	String name;
	int roll;
	
	public Student(String name, int roll) {
		this.name = name;  //this.name represent non static variable and name is local variable 
		this.roll = roll;
	}
}
