package Day9.java;

public class Swap_xor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=65,y=78;
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println("After swap : x="+x+",y="+y);
	}

}
