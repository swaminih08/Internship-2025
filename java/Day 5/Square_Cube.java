package Day5.java;

import java.util.Scanner;

public class Square_Cube {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n=s.nextInt();
		
		int Square=n*n;
		int Cube=n*n*n;
		
		System.out.println("Suare is : "+Square);
		System.out.println("Cube is : "+Cube);
	}
}
