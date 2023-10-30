package java_program;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int c,n;
		double fact;
		String s;
		
		
		do {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the sum of factorial Number");
			n=sc.nextInt();
			c=1;
			fact=1;
					while(c<=n)
					{
						fact = fact * c;
						c++;
					}
					
		System.out.printf("\nFactorial value of %.2f  N= %d \n",fact,n);
		System.out.println("Do you wish to continue ?(Y/N)");
		s=sc.next();
		}while(s.equalsIgnoreCase("Y")); 
		
		
	}

}
