package java_tamil_programming;

import java.util.Scanner;

public class Method_pass_value {
	public static void main(String[] args) {
		Method_pass_value o=new Method_pass_value();
		Scanner j=new Scanner(System.in);
		System.out.println("enter d");
		int d=j.nextInt();
		System.out.println("enter c");
		int c=j.nextInt();
		
		o.a(d, c);
		
	}
	public void a(int a,int b)
	{
		int c=a+b;
		System.out.println("values : "+c);
	}
	
}
