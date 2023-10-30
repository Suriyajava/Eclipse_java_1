package java_program;

import java.util.Scanner;

public class AddNUMBER {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int add,count=0;
		System.out.println("Enter the Add");
		add=s.nextInt();
		
		while(add>=count)
		{
			if(count%2==0)
			{
				count++;
			   continue;
			}
			
			System.out.println(count);
			count++;
		}
	}

}
