package Day18.java;

public class ArrayLoopException {

	public static void main(String[] args) {
		int []no= {10, 20, 30, 40, 50};
		
		try {
			for(int i=0; i<=no.length; i++)
			System.out.println("Element at index : "+no[i]);
		 }
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

	}

}
