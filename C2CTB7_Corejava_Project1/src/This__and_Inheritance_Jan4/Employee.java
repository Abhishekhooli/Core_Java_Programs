package This__and_Inheritance_Jan4;

public class Employee {
	
	int id;
	String name;
	String email;
	Float salary;
	
	public Employee()
	{
	}

	
	public Employee(int id, String name, String email, Float salary) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}
public Employee(int id) {
	this.id=id;
}

public String toString() {
	String str = "(" + id + "," + name + "," + email + "," + salary + ")";
	return str;

}
public static void main(String[]args) {
	Employee e1 = new Employee();
	e1.id = 101;
	e1.name = "abhishek";
	e1.email = "dakjdk";
	e1.salary = 154.65f;
	System.out.println(e1.toString());

	Employee e2 = new Employee( 112, "ajay" , "abnbsahgn", 12.563f);
	System.out.println(e2.toString());

	Employee e3 = new Employee( 113, "arun" , "jhvaasf", 3.434f);
	System.out.println(e3.toString());


	}

}
