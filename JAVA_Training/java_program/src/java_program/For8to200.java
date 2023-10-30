package java_program;

import java.util.Scanner;

public class For8to200 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=1,n;
		System.out.print("Enter the N value\n ");
		n=sc.nextInt();
		
		for(int i=2;i<=n;i+=2,a++)
		{
			System.out.printf("%5d",i);
			if(a%8==0)
			{
			System.out.print("\n");	
			}
		}
	}

}
