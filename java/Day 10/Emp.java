package Day10.java;

	class Person {
   
	       String name;
	      int age;
		
	}
  
  	class Employee extends Person{
	double salary;
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("age: "+age);
		System.out.println("salary: "+salary);
	}
}
 public class Emp
 {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.name="Swami";
		e.age=17;
		e.salary=67984;
		e.display();

	}
}
