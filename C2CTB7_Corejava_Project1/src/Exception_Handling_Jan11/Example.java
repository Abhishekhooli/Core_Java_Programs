package Exception_Handling_Jan11;

	import java.util.Scanner;

	public class Example {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);	
			System.out.println("Enter student id: ");
			int id=sc.nextInt();
			
			if(id>100)
			{
				System.out.println("Student found");
			}
			else
			{
				try
				{
					throw new StudentIdNotFound_Exception(id);
				}
				catch(StudentIdNotFound_Exception se)
				{
					System.out.println(se);	
					System.out.println(se.getMessage());
				}
			}

		}

	}

