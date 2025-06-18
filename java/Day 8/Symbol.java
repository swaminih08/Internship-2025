package Day8.java;
import java.util.*;
public class Symbol {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter currency code(INR, USD, EUR, GBP) : ");
		String code=s.next().toUpperCase();
		
		switch(code)
		{
		case "INR":
			System.out.println("Currency symbol :rupees");
			break;
		case "USD":
			System.out.println("Currency symbol :$");
			break;
		case "EUR":
			System.out.println("Currency symbol :");
			break;
		case "GBP":
			System.out.println("Currency symbol :");
			break;
		
		default:
			System.out.println("Invaid currency code.");
		}
	}

}
