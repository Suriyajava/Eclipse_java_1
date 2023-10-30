package java_tamil_programming;

import java.util.Scanner;

public class scanner_object {
	  public static void main(String[] args) {
		  
		Scanner c=new Scanner(System.in);
		
		System.out.println("Enter the Interger value :");
		int a=c.nextInt();
		
		System.out.println("Enter the float value :");
		float b=c.nextFloat();
		
		System.out.println("Enter the String :");
		String d=c.next();
		
		
		System.out.println("Integer  values is :"+a);
		System.out.println("Float  values is :"+b);
		System.out.println("String  values is :"+d);
		
		
	}

}
