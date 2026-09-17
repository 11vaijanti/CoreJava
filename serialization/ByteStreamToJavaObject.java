package serialization;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class ByteStreamToJavaObject {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file = new File("data.txt");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		//Student s1 = (Student) ois.readObject();
		//accessing multiple objects
		List<Student> list = (List<Student>) ois.readObject();
		System.out.println(list);

	}

}
