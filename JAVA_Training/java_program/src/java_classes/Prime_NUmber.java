package java_classes;

import java.util.Scanner;

public class Prime_NUmber {
	public static void main(String[] args) {
		pn obj=new pn();
		obj.read();
		obj.display();
	}

}
class pn
{
	private int nprime;

	public int getN() {
		return nprime;
	}
	public void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		nprime=sc.nextInt();
		sc=null;
	}
	public boolean isprime(int n)
	{
		int upto =(int)Math.sqrt(n);
		boolean prime =true;
		for(int i=2;i<=upto;i++)
		{
			if(n%i==0)
			{
				prime =false;
				break;
			}
		}
		return prime;
	}
	public void display()
	{
		for(int i=1,j=1; i<nprime;j++)
		{
			if(isprime(j))
			{
				i++;
				System.out.print(" "+j);
			}
		}
	}
}
