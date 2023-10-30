package java_number_pattern_;

import java.util.Scanner;

public class Numb {
	/* NUMBER PATTERN */
	public static void main(String[] args) {
	 String a;
	 Scanner s=new Scanner(System.in);
	 do {
	 System.out.println("Enter the number :");
	 int b=0,n=s.nextInt();
	for (int i = 1; i <= n; i++)
	{
		b++;
		
		for (int j = 1; j <=i; j++) 
		{
				System.out.print(b+" ");
		}
		System.out.println();
	}
		 System.out.println("Continue program click Y/y : ");
		 a=s.next();
		
	 }while(a.equalsIgnoreCase("y"));
	}

}
