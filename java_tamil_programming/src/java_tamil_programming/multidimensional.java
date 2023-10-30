package java_tamil_programming;

import java.util.Scanner;

public class multidimensional {
	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		
		int aa = 0;
		int y;
		do {
			System.out.println("CONTINUE ANY click & Exit 0" );
			String aa1=sc.next();
		
		int c ;
		int a;
		int b ;
		System.out.println("fist size");
	    a=sc.nextInt();
	    System.out.println("second size");
	    b=sc.nextInt();
	    System.out.println("three size");
	    c=sc.nextInt();
	    int e[][][]=new int [a][b][c];
	    
	    for(int i=0;i<a;i++)
	    {
	    	System.out.println("values   ");
	    	for(int j=0;j<b;j++)
	    	{
	    		
	    		for(int k=0;k<c;k++)
	    		{
	    			e[i][j][k]=sc.nextInt();
	    		}
	    	}
	    }
	    System.out.println("----------Result---------");
	    for(int i=0;i<a;i++)
	    {
	    	for(int j=0;j<b;j++)
	    	{
	    		System.out.println();
	    		for(int k=0;k<c;k++)
	    		{
	    			System.out.print(" e["+i+"]"+"["+j+"]"+"["+k+"] "+e[i][j][k]);
	    		}
	    	}
	    	System.out.println();
	    }
	
	} while(aa!='y');
		
		
	}
}



