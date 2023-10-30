package java_tamil_programming;

import java.util.Scanner;

public class arrayreturn {
	public static void main(String[] args) {
		arrayofmethod obj=new arrayofmethod();
		//int b[]=obj.displayarray();
		
	    }
	    int[] displayarray()
	   { 
			int s;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter size of array");
			s=sc.nextInt();
		int a[]=new int[s];
		
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
		return a;
		 
	  }
	   

}
