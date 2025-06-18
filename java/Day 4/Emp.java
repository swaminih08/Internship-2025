package Day3.java;

public class Emp {
	String name;
	int id;
	
	static int count=0;
	
	public Emp(String name, int id)
	{
		this.name=name;
		this.id=id;
		count++;
		
	}
	public void display()
	{
		System.out.println("ID:"+id+" , Name: "+name);
	}
	public static void main(String[] args) {
		Emp e1=new Emp("Swami",1);
		Emp e2=new Emp("Rushi",2);
		Emp e3=new Emp("Ruchya",3);
		
		e1.display();
		e2.display();
		e3.display();
		
		System.out.println("Total employee : "+Emp.count);
	}

}
