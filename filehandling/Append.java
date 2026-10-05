package filehandling;

import java.io.File;
import java.io.IOException;

public class Append {

	public static void main(String[] args) throws IOException {
		File f = new File("data.txt");
		System.out.println(f);
		System.out.println(f.createNewFile());

	}

}
