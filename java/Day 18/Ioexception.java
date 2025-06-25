package Day18.java;
import java.io.*;

public class Ioexception {

	public static void main(String[] args) {
		try {
			FileReader reader=new FileReader("nonexistent.txt");
			reader.read();
			reader.close();
			
		 }
		catch(IOException e) {
			System.out.println(e);
		}


	}

}
