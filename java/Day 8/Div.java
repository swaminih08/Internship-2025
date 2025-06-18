package Day8.java;
import java.util.*;

public class Div {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number : ");
		int no=s.nextInt();
		if(no%5==0 && no%11==0)
		{
			System.out.println("Nunber is divided by 5 and 11");
		}
		else
		{
			System.out.println("Number is not divided by 5 and 11");
		}
		
	}

}
