package java_tamil_programming;

import java.util.Scanner;

public class constructor {
	public static void main(String[] args) {
		Scanner c=new Scanner(System.in);
	
	System.out.println("Enter the NAME");
	String s=c.next();
	System.out.println("Enter the AGE");
	int a=c.nextInt();
	constructor obj=new constructor(s,a);
		
	}
	public constructor(String n, int a) {
		int picode=a;
		String name=n;
		
		System.out.println("Constructor");
		System.out.println("picode  = "+picode);
		System.out.println("name   = "+name);
	}
	

}
