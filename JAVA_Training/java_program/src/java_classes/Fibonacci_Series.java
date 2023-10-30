package java_classes;

import java.util.Scanner;

public class Fibonacci_Series {
	public static void main(String[] args) {
		
		fibonacci obj=new fibonacci();
		obj.main();
		obj=null;
	}
}
class fibonacci
{
	private int n,f,f1,f2;
	Scanner sc=new Scanner(System.in);
	public void main() {
		String  s;
		do {
			fibonacci o=new fibonacci();
			o.read();
			o.result();
			o=null;
			System.out.println("\n\nDO YOU CONTINUE CLICK Y");
			s=sc.next();
		}while(s.equalsIgnoreCase("y"));
	}

	public int getN() {
		return n;
	}

	public int getF() {
		return f;
	}

	public int getF1() {
		return f1;
	}

	public int getF2() {
		return f2;
	}
	public int read()
	{
		System.out.println("Enter the N values ");
		n=sc.nextInt();
		return n;
	}
	public void result()
	{ 
		//int f,f1,f2;
		f1=1;
		f2=1;
		System.out.printf("%d  %d",f1,f2);
		for(int i=3;i<=n;i++)
		{
			f=f1+f2;
			f1=f2;
			f2=f;
			System.out.printf(" %d ",f);
		}
	}
}
