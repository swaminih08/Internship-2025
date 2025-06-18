package Day8.java;
import java.util.*;
public class Leapyear {

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter year : ");
		int year=s.nextInt();
		if(year%4==0)
		{
			System.out.println("Year is Leap.");
		}
		else
		{
			System.out.println("Year is not leap.");
		}
	}

}
