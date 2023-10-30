package org.jsp.Array;

import java.util.Scanner;

public class twodimensionalAdvanced {
	public static void main(String[] args) {
		two o=new two();
		o.sum();
		o.print();
		o=null;
	}

}
class two
{
   int r,c;
   private int [][]mark;
   Scanner sc=new Scanner(System.in);
   
 public two() {
	 System.out.println("Enter the row");
	 r=sc.nextInt();
	 System.out.println("Enter the column");
	 c=sc.nextInt();
	 mark=new int [r][c];
	}
 public void sum()
 {
	 for(int i=0;i<r;i++)
	 {
		 for(int j=0;j<c;j++)
		 {
			 System.out.print("Next value ["+i+"]["+j+"] ?");
			 mark[i][j]=sc.nextInt();
		 }
	 }
 }
 public void print()
 {
	for (int[] is : mark)
	{
		System.out.println();
		for (int i : is) 
		{
		System.out.print(" "+i);	
		}
	}
 }
}
