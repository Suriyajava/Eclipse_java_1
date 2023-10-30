package java_classes;

import java.util.Scanner;

public class Star_pattern {
	public static void main(String[] args) {
		star o=new star();
		o.read();
		o.print();
		o=null;
	}

}
class star
{
	private int n;

	public int getN() {
		return n;
	}
		public void  read()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("How many star print ?");
			n=sc.nextInt();
		}
	public void print()
	{
		for(int i=1;i<=n;i++)
		{	
			System.out.print("\n");
			for(int j=1;j<=n-i;j++)
			
			System.out.print(" ");
			
				for(int j=1 ;j<=i;j++)
				System.out.print(" *");
			
		}
	}
}
