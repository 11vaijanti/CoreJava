package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {

	public static void main(String[] args) throws IOException {
		File f = new File("data.txt");
		System.out.println(f);
		System.out.println(f.createNewFile());
		FileWriter fw = new FileWriter(f);
		fw.write("helo hi bye bye");
		fw.flush();
	}

}
