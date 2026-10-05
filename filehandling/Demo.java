package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo {
	public static void main(String[] args) throws IOException {
		File f = new File("data.txt");
		FileReader fr = new FileReader(f);
		int ch = fr.read();
		String data = "";
		while(ch!=-1) {
			data+=(char)ch;
			ch = fr.read();
		}System.out.println(data);
	}

}
