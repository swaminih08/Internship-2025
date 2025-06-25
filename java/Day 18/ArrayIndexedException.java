package Day18.java;

public class ArrayIndexedException {

	public static void main(String[] args) {
		int []no= {10, 20, 30, 40, 50};
		try {
			System.out.println("6th element ; "+no[5]);
		 }
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

	}

}
