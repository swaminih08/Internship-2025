package Day18.java;
import java.io.*;
import java.io.FileReader;

public class Filenotfound {

	public static void main(String[] args) {
		try
		{
			FileReader reader=new FileReader("missingfile.txt");
			int ch;
			while((ch=reader.read())!=-1)
			{
				System.out.println((char)ch);
			}
			reader.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}

	}

}
