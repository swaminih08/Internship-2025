package Day8.java;
import java.util.*;

public class Grade {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Grade: ");
		char Grade=s.next().toUpperCase().charAt(0);

		switch(Grade)
		{
			case 'A':
				System.out.println("Excellent");
				break;
			case 'B':
				System.out.println("Good");
				break;
			case 'C':
				System.out.println("Average");
				break;
			case 'D':
				System.out.println("Below Average");
				break;
			case 'F':
				System.out.println("Fail");
				break;
			
			default:
				System.out.println("Invaid Grade.");
		}
		
	}
}
