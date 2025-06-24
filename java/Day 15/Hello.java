package Day15.java;

public class Hello implements Runnable {
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello from thread....");
		}
		
	}
	public static void main(String[] args) {
		
		Hello h=new Hello();
		Thread t=new Thread(h);
		t.start();
	}

	
}
