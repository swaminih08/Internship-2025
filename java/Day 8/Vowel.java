package Day8.java;
import  java.util.*;

public class Vowel {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Character : ");
		char ch=s.next().toLowerCase().charAt(0);

		switch(ch)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				
				System.out.println("Vowe");
				break;
				default:
					if(ch>='a' && ch<='z')
					{
						System.out.println("Constant");
					}
					else
					{
						System.out.println("Invaid alphabet");
					}
		}
	}

}
