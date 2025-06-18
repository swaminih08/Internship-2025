package Day10.java;
import java.util.*;

public class Book {
	public void display()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Title : ");
	String T=s.next();
	System.out.println("Enter Author : ");
	String A=s.next();
	
	System.out.println("Tite: "+T);
	System.out.println("Author: "+A);
	
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book();
		Book b2=new Book();
		
		b1.display();
		b2.display();
	}

}
