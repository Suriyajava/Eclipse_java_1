package C_Data_structrure;

import java.util.Scanner;

public class find_the_smell_numnber {
	public static void main(String[] args) {
		Scanner o=new Scanner(System.in);
		
		int n;
		int smell=0,avg=0,max=0,totall=0; 
		
		System.out.println("Enter the array size");
		n=o.nextInt();
		int []array =new int[n];
		
		System.out.println("Enter a values ");
		
		for(int i=0;i<n;i++)
		{
			array[i]=o.nextInt();
			
		}
		o.close();
		
		smell=max=array[0];
		for(int i=0;i<n;i++)
		{
			totall+=array[i];
			
			
			
			if(smell>array[i])
			{
				smell=array[i];
			}
			if(max<array[i])
			{
				max=array[i];
			}
			
		}
		avg=totall/n;
		System.out.println("SMELL VALUE    "+smell);
		
		System.out.println("MAXIMUM VALUE  "+max);
		
		System.out.println("AVERAGE VALUE  "+avg);
		
		System.out.println("TOTALL VALUE   "+totall);
		
		
	}

}
