package Day17.java;

public class Division {

	public static void main(String[] args) {
		int a=10;
		int b=0;
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
