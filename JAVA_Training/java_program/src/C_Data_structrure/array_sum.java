
package C_Data_structrure;

import java.util.Scanner;

public class array_sum {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n;
		int sum=0;
		System.out.println("enter the array size ");
		n=in.nextInt();
		
		int[] array=new int[n];
		System.out.println("values ");
		for(int i=0;i<n;i++)
		{
			array[i]=in.nextInt();
		}
		for(int j=0;j<n;j++)
		{
		sum=sum+array[j];
		
		}
		
			System.out.println("Total sum is "+sum);
		
		in.close();
		}

}
