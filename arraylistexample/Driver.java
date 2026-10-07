package arraylistexample;

import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		List<Student> li = new ArrayList<>();
		li.add(new Student(1,"maya",199380,100));
		li.add(new Student(2,"vaishu",8893748,92));
		li.add(new Student(3,"vaibhav",186820,95));
		li.add(new Student(4,"vinu",76978,78));
		
		while(li.hasnext()) {
			System.out.println(li.next());
			
		}
		
	}

}
