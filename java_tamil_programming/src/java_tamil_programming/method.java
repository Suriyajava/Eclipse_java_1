package java_tamil_programming;

import java.util.Scanner;

public class method {
	public static void main(String[] args) {
		method obj=new method();
		obj.sum();
		
	}
    public void sum() {
    	Scanner sc=new  Scanner(System.in);
    	System.out.println("Enter a :");
    	int a=sc.nextInt();
    	System.out.println("Enter b  :");
    	int b=sc.nextInt();
    	int c=a+b;
    	System.out.println(c);
		
	}
}
