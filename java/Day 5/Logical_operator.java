package Day5.java;

import java.util.Scanner;

public class Logical_operator {
	public static void main(String[] args) {
		
		int mark;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter mark : ");
		mark=s.nextInt();
		if(mark>40)
		{
			System.out.println("Pass");
		}
		else 
		{
			System.out.println("Fail");
		}
	}
}
