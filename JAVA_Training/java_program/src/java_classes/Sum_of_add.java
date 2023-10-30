package java_classes;

import java.util.Scanner;

public class Sum_of_add {
	public static void main(String[] args) {
		sums o=new sums();
		o.read();
		o.calculate();
		o.display();
		o=null;
	}
}
class sums
{
	private int n,sum;

	public int getN() {
		return n;
	}
	public int getSum() {
		return sum;
	}
	public void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		n=sc.nextInt();
		sc=null;
	}
	public void calculate()
	{ sum=0;
		for(int i=1,j=1;i<=n;i++,j+=2)
		{
			sum +=j;
			//System.out.println(j);
		}
	}
	public void display()
	{
		System.out.printf("Sum of First %d Odd number Is %d.",n,sum);
	}
}
