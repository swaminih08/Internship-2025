package Day9.java;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int n=1;n<=5;n++)
		{
			int factorial=1;
		
		for(int i=1;i<=n ;i++)
		{
			factorial*=i;
		}
		
		System.out.println("Factorial of "+n+"="+factorial);
	}
	}
}
