package Day9.java;
import java.util.*;

public class Logical_or {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age =s.nextInt();
		
		if(age>=60 || age<=12)
		{
			System.out.println("a person is either a senior citizens or a child");
		}
		else
		{
			System.out.println("a person is neither a senior citizens or a child");
		}
	}

}
