package org.jsp.Array;

import java.util.Scanner;

public class TwoDimensionalArray {
	public static void main(String[] args) {
	twodimensional obj=new twodimensional();
	obj.sum();
	obj.print();
	obj=null;
	}
}
class twodimensional
{
   int r,c;
   private int [][]mark;
   Scanner sc=new Scanner(System.in);
   
 public twodimensional() {
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
			 System.out.print("Next print ?");
			 mark[i][j]=sc.nextInt();
		 }
	 }
 }
 public void print()
 {
	 System.out.println(":------ Array Print-----:");
	 for(int i=0;i<r;i++)
	 {
		 for(int j=0;j<c;j++)
		 {
			 System.out.print(mark[i][j]+" ");
		 }
		 System.out.println();
	 }
 }
	
}
