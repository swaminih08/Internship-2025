package Day5.java;

import java.util.Scanner;

public class Arithmetic_operator {
	public static void main(String[] args) {
		
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of A");
		a=s.nextInt();
		System.out.println("Enter the value of B");
		b=s.nextInt();
		
		System.out.println("Addition of two numbers : "+(a+b));
		System.out.println("Substraction of two number : "+(a-b));
		System.out.println("Multiplication of two number : "+(a*b));
		System.out.println("Remainder of two numbers : "+(a%b));
		System.out.println("Division of two numbers : "+(a/b));

	}
}
