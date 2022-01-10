package Variables_Dec28;


      public class Variable_Demo {
 
		int a = 1024;
		int b;

		void func1() {
			int c;
			c = 10;
			System.out.println("class variable" + " " + b);
			System.out.println("local variable" + c);
			a = 7890;
			b = 56;
			System.out.println("class variable" + " " + b);
		}
		void func2() {
			System.out.println("class variable" + " " + b);
		}

	}


