package org.jsp.Array;

public class trycatch {
	public static void main(String[] args) {
		trys o=new trys();
		o.trys();
		o=null;
	}
}
class trys
{
 public void trys()
 {
	try
	{
		int a=10/0;
		System.out.println("value of a is "+a);
	}catch (Exception e)
	{
		System.out.println("first Try Catch Exception"+e.getMessage());
	}
	finally
	{
		System.out.println("first try catch finally ");
	}
 
 try
	{
		int a=100/10;
		System.out.println("value of a is "+a);
	}catch (Exception e)
	{
		System.out.println("second Try Catch Exception"+e.getMessage());
	}
	finally
	{
		System.out.println("second try catch finally ");
	}
}
}
