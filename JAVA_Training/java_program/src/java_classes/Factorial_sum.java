package java_classes;

import java.util.Scanner;

public class Factorial_sum {
	public static void main(String[] args) {
		fact obj=new fact();
		obj.getinput();
		obj.display();
		obj=null;
	}
}
class fact
		{
			private int n, facts;
		
			public int getn() {
				return n;
			}
		
			public int getFacts() {
				return facts;
			}
				
				int getinput()
				{
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter your Factorial number");
					n=sc.nextInt();
					sc=null;
				return  n;	
				}
			void display()
			{
				facts=1;
				for(int i=1;i<=n;i++)
				{
					facts *=i;
					System.out.println("i = "+i+" * = "+facts);
				}
				System.out.println("\nFinal Result Factorial value is "+facts);
			}
		}
