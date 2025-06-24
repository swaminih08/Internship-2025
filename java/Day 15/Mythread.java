package Day15.java;
import java.lang.*;
class Mythread extends Thread{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Number : "+i);
		
		try
		{
			Thread.sleep(1000);
			
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
			
		}
		}
	}
	public static void main(String[] args) {
		
		Mythread t=new Mythread();
		t.start();
	}

}
