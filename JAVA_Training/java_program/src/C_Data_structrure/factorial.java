package C_Data_structrure;

import java.util.Scanner;

public class factorial {
	
	public static void main(String[] args) {
		
	
	Scanner in=new Scanner(System.in);int sum=1;
	int n,i=0;
	System.out.println("Enter the factoral number ");
	n=in.nextInt();
	while(n>i)
	{
		i++;
		sum=i*sum;
	
	System.out.println(+i+" * "+sum);
	}
	System.out.println("FACTORAL VALUES IS "+sum);
	
}
}
