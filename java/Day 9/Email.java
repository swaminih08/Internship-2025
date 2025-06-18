package Day9.java;

public class Email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email="User@example.com";
		String[] parts=email.split("@");
		if(parts.length==2)
		{
			System.out.println("Username: "+parts[0]);
			System.out.println("Domain : "+parts[1]);
			
		}
		else
		{
			System.out.println("Invalid email format.");
		}
	}

}
