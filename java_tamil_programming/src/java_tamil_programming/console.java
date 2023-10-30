package java_tamil_programming;
import java.io.*;
public class console {
	
	public static void main(String[] args)throws Exception  
	{
		System.out.println("Enter the String");
		String name=System.console().readLine();
		
		System.out.println(name);
		 int a=Integer.parseInt(System.console().readLine());
		 System.out.println("interger  "+a);
		 float b=Float.valueOf(System.console().readLine());
		 System.out.println("float "+b);
	}

}
