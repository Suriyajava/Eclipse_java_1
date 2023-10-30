package java_classes;

import java.util.Scanner;

public class Sine_X {
	public static void main(String[] args) {
		sine o=new sine();
		o.read();
		o.text();
		o=null;
	}

}
class sine
{
	private double x,sinex;
	private int n;
	public double getX() {
		return x;
	}
	public double getSinex() {
		return sinex;
	}
	public int getN() {
		return n;
	}
	public void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value x");
		x=sc.nextDouble();
		System.out.println("How many terms ?");
		n=sc.nextInt();
		sc=null;
	}
	public void text()
	{
	x=1;
	n=5;
	sinex=0;
	int mf=1,i,j;
	long fact=1;
	for(i=1,j=1;i<=10;i++,j+=2)
	{
		sinex =sinex+(mf)*(Math.pow(x,j)/fact);
		mf*=-1;
		fact *=(j+1);
		fact *=(j+2);
	}
	System.out.printf("\nSinx(%f) is %f ",x,sinex);
	}
}
