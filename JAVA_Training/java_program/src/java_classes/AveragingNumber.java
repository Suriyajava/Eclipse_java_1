package java_classes;
import java.util.Scanner;

public class AveragingNumber {
	private int N;
	private double sum;
	
	public int  getN()
	{
		return N;
	}
	public double getaverge()
	{
		return sum/N;
		 
	}
	public double getsum()
	{
		return sum;
	}
	public void start()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("How may Number Please Enter ");
		N=in.nextInt();
		
		double nextN;
		
		for(int i=1;i<=N;i++)
		{
			System.out.print("Next Number ?");
			nextN=in.nextDouble();
			
			sum = sum + nextN;
		}
		System.out.printf(" Sum of %.2f is Averaging Number of %.2f.  ",sum , getaverge());
		in=null;
	}

}
