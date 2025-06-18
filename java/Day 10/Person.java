package Day10.java;

public class Person {
	String name;
	int age;
	}
 class Emp extends Person
{
	double salary;
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("age: "+age);
		System.out.println("salary: "+salary);
	}
	

	public static void main(String[] args) {
		Emp e=new Emp();
		e.name="Swami";
		e.age=17;
		e.salary=67984;
		e.display();

	}
}

