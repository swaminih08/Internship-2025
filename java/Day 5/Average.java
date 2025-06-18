package Day5.java;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter marks 1 : ");
		int m1=s.nextInt();
		System.out.println("Enter marks 2 : ");
		int m2=s.nextInt();
		System.out.println("Enter marks 3 : ");
		int m3=s.nextInt();
		
		double avg =(m1+m2+m3)/3;
		System.out.println("Average is : "+avg);

	}

}
