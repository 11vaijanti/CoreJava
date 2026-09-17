package serialization;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class JavaObjToByteStream {

	public static void main(String[] args) throws IOException {
		File f = new File("data.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Student s1 = new Student("Raju",12);
		Student s2 = new Student("Sham",10);
		Student s3 = new Student("babu",11);
		List<Student> l = new ArrayList<>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		oos.writeObject(l);
	}
	

}