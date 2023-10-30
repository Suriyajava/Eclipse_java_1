package java_tamil_programming;

import java.util.Scanner;

public class three_dymainal_array {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter the Size");
		int a=sc.nextInt();
		
		System.out.println("Enter the Size");
		int b=sc.nextInt();
		 
		int d[] []=new int [a][b];
		
		
		for(int i=0;i<d.length;i++)
		{
			System.out.println("values ");
			for(int j=0;j<d.length;j++)
			{
			d[a][b]=sc.nextInt();
			}
		}
		for(int i=0;i<d.length;i++)
		{
			for(int j=0;j<d.length;j++)
			{
				System.out.print(d[i][j]);
			}
			System.out.println();
		}
		
	}

}
