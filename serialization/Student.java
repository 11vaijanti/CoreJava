package serialization;

import java.io.Serializable;
import java.util.Objects;



public class Student implements Serializable {
	String name;
	int roll;
	
	public Student(String name,int roll) {
		super();
		this.name = name ;
		this.roll = roll;
	}
	@Override
	public String toString() {
		return "Student[name : "+name+" + roll : "+roll+"]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, roll);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && roll == other.roll;
	}

}
