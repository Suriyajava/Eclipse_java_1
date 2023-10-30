package C_Data_structrure;

import java.util.Scanner;

public class pyramid {
	public static void main(String[] args) {
		int n,j,i;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter A n values ");
		n=in.nextInt();
		
		for(i=0;n>i;i++)
		{
			System.out.println();
			for(j=0;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(j=i;j>=0;j--)
			{
				System.out.print(j);
			}
			for(j=1;j<=i;j++)
				System.out.print(j);
			
		}
		in.close();
	}

}
