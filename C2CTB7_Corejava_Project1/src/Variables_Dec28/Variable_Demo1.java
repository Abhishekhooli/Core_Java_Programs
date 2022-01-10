package Variables_Dec28;

public class Variable_Demo1 {

	final static int a = 1024;
	int b;

	void func1() {
		final int c;
		c = 10;
		System.out.println("class variable "+ a +" "+ b);
		System.out.println("local variable " + c);
		b=56;
		System.out.println("class variable " + a + " "+ b);
	}
	void func2() {
		System.out.println("class variable " + a + " "+ b);
	}

	public static void main(String[] args) {
		Variable_Demo1 obj = new Variable_Demo1();
		System.out.println(obj.b);
		System.out.println(Variable_Demo1.a);

	}
}
