package java_classes;
import java.util.Scanner;
public class Interactive_program {
	public static void main(String[] args) {
		interactive obj=new interactive();
		obj.main();
	}
}
class interactive
{
	private int n;
     Scanner sc=new Scanner(System.in);
     public void main() 
     { 
    	 do {
    		 System.out.println("Enter the Number ? ");
    		 n=sc.nextInt();
    		 if(n==0)break;
    	 if(isprime(n))
    		 System.out.println(n+" Is A Prime Number");
    	 else
    		 System.out.println(n+" Is Not a Prime Number");
    	 if(isfibocci(n))
    		 System.out.println(n+" Is A Fibonacci Number\n");
    	 else 
    		 System.out.println(n+" Is A Not Fibonacci Number\n");
     }while(n!=0);
    	 
     }
     
	public int getN() {
		return n;
	}
	public void read()
	{
		System.out.println("\nEnter the N value ");
		n=sc.nextInt();
	}
	private boolean isprime(int n)
	{ 
		boolean prime=true;
		int upto =(int)Math.sqrt(n);
		for(int i=2;i<=upto;i++)
		{
			if(n%i==0)
			{
			prime=false;
			break;
			}
		}
		return prime;
	}
	private boolean isfibocci(int n)
	{
		boolean fibo=false;
		int f1=1,f2=1,f;
		while(f2<=n)
		{
		if(n==f2)
		{
		fibo =true;
		break;
		}
		f=f1+f2;
		f1=f2;
		f2=f;
		}
		return fibo;
	}
}
