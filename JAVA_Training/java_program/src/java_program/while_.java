package java_program;

import java.util.Scanner;

public class while_ {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int counting=0,end;
	
		System.out.println("Enter the Ending values ");
		end=s.nextInt();
		
		while(counting<=end)
		{
			System.out.println(counting);
			counting++;
		}
	}

}
