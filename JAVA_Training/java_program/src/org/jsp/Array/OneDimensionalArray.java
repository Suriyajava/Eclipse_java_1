package org.jsp.Array;

import java.util.Scanner;
public class OneDimensionalArray {
	public static void main(String[] args) {
		onedimensinal obj=new onedimensinal();
		obj.sum();
		obj.finalize();
		obj=null;
	}
 }
class onedimensinal
{
	private int[] mark;
	int n;
	public int[] getMark() {
		return mark;
	}
	public onedimensinal()   // This method is Constructor
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array size ?");
		
		 n=sc.nextInt();
		mark=new int[n];
		for(int i=0;i<n;i++)
		{
			 mark[i]=sc.nextInt();
			 sc=null;
		}
	}
	public void  finalize ()
	{
		mark=null;
	}
	public void sum()
	{
		int min,max;
		min =mark[0];
		max =mark[0];
		for(int i=0;i<n;i++)
		{
			
		 if(min>mark[i])
			 min =mark[i];
		 if(max<mark[i])
			 max=mark[i];
		}
		System.out.println("Minimum is "+min);
		System.out.println("Maxmun is "+max);
	}
}
