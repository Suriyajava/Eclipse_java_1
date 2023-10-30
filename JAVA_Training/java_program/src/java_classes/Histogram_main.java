package java_classes;

import java.util.Scanner;

public class Histogram_main {
	public static void main(String[] args) {
		historam o=new historam();
		o.getresult();
		o=null;
	}
}
class historam
{

	void getresult()
	{ 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any  5 number");
		int n,i,j;
		for(i=1;i<=5;i++)
		{
			n=sc.nextInt();
			 System.out.printf("\n %2d",n);
			 
			for(j=1;j<=n;j++)
				System.out.print(" *");
			
		}
    }
}
