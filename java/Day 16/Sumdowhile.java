package Day16.java;
import java.util.*;

public class Sumdowhile {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number to find factorial : ");
		int num=s.nextInt();
		int sum=0;
		
		do {
			int digit=num%10;
			sum+=10;
			num/=10;
		}while(num>0);
		
		System.out.println("Sum of digit is : "+sum);
		

	}

}
