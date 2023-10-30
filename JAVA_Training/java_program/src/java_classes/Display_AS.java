package java_classes;

import java.util.Scanner;

public class Display_AS {
	private String instring;

	public String getInstring() {
		return instring;
	} 

	public String read(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Characters");
		instring=sc.nextLine();
		return instring;
	}
	public void Calculaction()
	{
		char c;
		System.out.println("Character  = ASCII value");
		for(int i=0;i<instring.length();i++)
		{
			c=instring.charAt(i);
			System.out.printf("\n %c =  %d",c,(int)c);
		}
			
	}
}
