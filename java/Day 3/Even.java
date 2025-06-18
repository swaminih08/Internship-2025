package Day3.java;

public class Even {
	public void PrintEven(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		Even obj=new Even();
		obj.PrintEven(20);
	}

}