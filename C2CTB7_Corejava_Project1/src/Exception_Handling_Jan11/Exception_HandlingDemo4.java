package Exception_Handling_Jan11;

import java.io.IOException;

public class Exception_HandlingDemo4 {
	void m()throws IOException
	{
	throw new IOException("device error");//checked exception
	}
	void n()throws IOException
	{
	m();
	}
	void p()
	{
	try
	{
	n();
	}
	catch(Exception e){System.out.println("exception handled");}
	}
	public static void main(String args[])
	{
  Exception_HandlingDemo4 obj=new Exception_HandlingDemo4();
	obj.p();
	System.out.println("normal flow...");
	}

}
