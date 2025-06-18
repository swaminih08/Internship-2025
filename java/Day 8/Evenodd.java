package Day8.java;
import java.util.*;

public class Evenodd {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int no=s.nextInt();
		if(no%2==0)
		{
			System.out.println("Number is Even.");
		}
		else
		{
			System.out.println("Number is odd.");
		}
	}

}
