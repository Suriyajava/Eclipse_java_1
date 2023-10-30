package java_tamil_programming;

import java.util.Scanner;

public class arrayofmethod {
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		
		int n=sc.nextInt();
	    int a[]=new int [n];
	    
		arrayofmethod d=new arrayofmethod();
		System.out.println("Enter values");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		d.result();
		d.arraya(a);
	  }
		 int arraya(int b[]) 
		{
			 int b1[];
			for(int i=0;i<b.length;i++)
			{
				System.out.println(b[i]);
			}
			return 0;
			 
		}
		 private void result() {
			 System.out.println("------Result-------");

		}
	
	
}
