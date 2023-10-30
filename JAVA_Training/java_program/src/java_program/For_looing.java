package java_program;

import java.util.Scanner;

public class For_looing {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n,a=10;
		System.out.println("Enter the n value");
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
			
		{
				System.out.print(" "+i);
				if(i==a)
				{
					a=a+10;
					System.out.println();	
				}
		}
	}

}
