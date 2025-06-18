package Day9.java;

public class Local {
	public void display()
	{
		int no=42;
		System.out.println("local variable value : "+no);
	}

	public static void main(String[] args) {
		Local l=new Local();
		l.display();
	}

}
