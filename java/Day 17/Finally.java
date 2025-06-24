package Day17.java;

public class Finally {

	public static void main(String[] args) {
		int a=20;
		int b=0;
		
		try
		{
			int div=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divided by zero.");
		}
		finally
		{
			System.out.println("I am always execute.");
		}

	}

}
