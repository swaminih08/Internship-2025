package Day17.java;

public class Multiple {

	public static void main(String[] args) {
		int a=17;
		int b=22;
		try
		{
			System.out.println("Addition : "+(a+b));
			System.out.println("Substraction : "+(a-b));
			System.out.println("multipication : "+(a*b));
			System.out.println("Division : "+(a/b));
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Program is closed.");
		}

	}

}
