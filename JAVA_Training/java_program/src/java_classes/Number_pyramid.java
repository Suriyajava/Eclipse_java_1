package java_classes;

import java.util.Scanner;

public class Number_pyramid {
	public static void main(String[] args) {
		pyramid p=new pyramid();
		p.read();
		p.ptint();
		p=null;
	}

}
class pyramid
{
	private int n;

	public int getN() {
		return n;
	}
	public void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		sc=null;
	}
	public void ptint()
	{ int k,j;
		for(int i=1;i<=n;i++)
		{  
			System.out.print("\n");
			for(j=1;j<=n-i;j++)
				System.out.print(" ");
			 
			for(k=i,j=1;j<=i;j++,k++)
			{
				System.out.printf("%d",k%10);
			}
			for(j=1,k-=2;j<i;j++,k--)
				System.out.printf("%d",k%10);
		}
	}
}
