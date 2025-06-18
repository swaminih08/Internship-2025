package Day5.java;

import java.util.Scanner;

public class Vote {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int age=s.nextInt();
		
		if(age>=18 && age<=120)
		{
			System.out.println("You are eligible to vote.");
		}
		else if(age>=18 || age<=120)
		{
			System.out.println("Invalid age is entered");
		}
		else
		{
			System.out.println("You are not eligible.");
		}
	}
}
