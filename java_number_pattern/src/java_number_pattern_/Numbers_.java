package java_number_pattern_;

import java.util.Iterator;
import java.util.Scanner;

public class Numbers_ {
	/* NUMBER PATTERN */
	public static void main(String[] args) {
	 String a;
	 Scanner s=new Scanner(System.in);
	 do {
	 System.out.println("Enter the number :");
	 int count=1,n=s.nextInt();
	 
	for (int i = 1; i <= n; i++)
	{
		
		for (int j = i; j <=n; j++) 
		{
				System.out.print(" ");
		}
		for(int k=1;k<=i;k++,count+=1)
		{
			System.out.print(count +" ");
		}
		System.out.println();
	}
		 System.out.println("Continue program click Y/y : ");
		 a=s.next();
		
	 }while(a.equalsIgnoreCase("y"));
	}

}
