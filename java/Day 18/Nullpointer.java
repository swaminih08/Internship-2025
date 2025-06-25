package Day18.java;

public class Nullpointer {

	public static void main(String[] args) {
		String str=null;
		try {
			System.out.println("Length of string : "+str.length());
		 }
		catch(NullPointerException e) {
			System.out.println(e);
		}


	}

}
