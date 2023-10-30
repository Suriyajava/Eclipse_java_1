package java_tamil_programming;

import java.util.Scanner;

public class array_1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an array size");
		int n=sc.nextInt();
		
		int a[]=new int [n];
		System.out.println("Enter the values ");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Result------------------");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
