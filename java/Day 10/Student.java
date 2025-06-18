package Day10.java;

public class Student {
	String name="Swamini";
	int age=17;
	
	public void display()
	{
		System.out.println("Name is : "+name);
		System.out.println("Age is : "+age);
		
	}

	public static void main(String[] args) {
		Student s=new Student();
		s.display();
	}

}
