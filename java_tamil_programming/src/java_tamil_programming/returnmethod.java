package java_tamil_programming;

import java.util.Scanner;

public class returnmethod {
	public static void main(String[] args) {
		
		Scanner c=new Scanner(System.in);
		returnmethod a=new returnmethod();
		int z,x,y;
		System.out.println("Enter the values");
		z=c.nextInt();
		System.out.println("Enter the values");
		x=c.nextInt();
		
		y=a.sum(z, x);
		System.out.println("Result ="+y);
		
		
	}
	int sum(int a,int b)
	{
		int c=a+b;
	return c;	
	}

}
