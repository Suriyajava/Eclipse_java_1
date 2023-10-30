package java_number_pattern_;

import java.util.Scanner;

public class Num {
	/* NUMBER PATTERN */
	public static void main(String[] args) {
	 String a;
	 Scanner s=new Scanner(System.in);
	 do {
	 System.out.println("Enter the number :");
	 int n=s.nextInt();
	 
	for (int i = 1; i <= n; i++)
	{
		
		for (int j = 1; j <=i; j++) 
		{
				System.out.print(j+" ");
		}
		System.out.println();
	}
		 System.out.println("Continue program click Y/y : ");
		 a=s.next();
		
	 }while(a.equalsIgnoreCase("y"));
	}

}
