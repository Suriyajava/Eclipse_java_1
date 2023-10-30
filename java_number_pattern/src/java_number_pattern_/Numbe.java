package java_number_pattern_;

import java.util.Scanner;

public class Numbe {
	/* NUMBER PATTERN */
	public static void main(String[] args) {
	 String a;
	 Scanner s=new Scanner(System.in);
	 do {
	 System.out.println("Enter the number :");
	 int count=1,n=s.nextInt();
	 
	for (int i = 1; i <= n; i++)
	{
		
		for (int j = 1; j <=i; j++) 
		{
				System.out.print(count+" ");
				count++;
		}
		System.out.println();
	}
		 System.out.println("Continue program click Y/y : ");
		 a=s.next();
		
	 }while(a.equalsIgnoreCase("y"));
	}
}
