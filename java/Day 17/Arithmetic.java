package Day17.java;
import java.util.*;

public class Arithmetic {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a first number : ");
		int a=s.nextInt();
		System.out.println("Enter a second number : ");
		int b=s.nextInt();
		
		try
		{
			int div=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divided by zero.");
		}

	}

}
