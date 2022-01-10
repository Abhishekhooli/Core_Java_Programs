package This__and_Inheritance_Jan4;

public class Student {

	int id;
	String name;
	String contact;

	public Student()
	{

	}

	public Student(int id, String name, String contact) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
	}

	public Student(int id) {
		this.id=id;
	}
	public String toString() {
		String str = "(" + id + "," + name + "," + contact + ")";
		return str;
	}

	public static void main(String[]args) {
		Student s1 = new Student();
		s1.id = 11;
		s1.name = "abhishek";
		s1.contact = "920664885";
		System.out.println(s1.toString());

		Student s2 = new Student( 112, "ajay" , "4548742");
		System.out.println(s2.toString());

		Student s3 = new Student( 113, "arun" , "454842");
		System.out.println(s3.toString());


	}
}
