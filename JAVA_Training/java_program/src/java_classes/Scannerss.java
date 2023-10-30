package java_classes;

import java.util.Scanner;

public class Scannerss {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println(sc);
		
		System.out.println("Enter N");
		
		n=sc.nextInt();
		
		System.out.println(sc);
		
		System.out.println(n);
		
		obj c=new obj();
		
		c.ss();
		System.out.println(c);
		sc=null;
		
		System.out.println(sc);
	}

}
class obj
{

	public void ss()
	{
		System.out.println("ss");
	}
}
