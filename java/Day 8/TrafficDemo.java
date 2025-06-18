package Day8.java;
import java.util.*;


public class TrafficDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter colour: ");
		String colour =s.next();
		
		switch(colour)
		{
			case "Red":
				System.out.println("Stop");
				break;
			case "Yellow":
				System.out.println("wait");
				break;
			case "Green":
				System.out.println("start");
				break;
			default:
				System.out.println("Invalid colour");
	}

	}
}
