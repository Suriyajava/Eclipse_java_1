package java_program;

import java.util.Scanner;

public class Fahrenheit {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		float f,c;
		System.out.println("Enter the Fahrenheit Temperature :");
		
		f=s.nextFloat();
		
		c=(float) ((5/9.0)*(f-32));
		 System.out.printf("%f  deg Fahrenheit  is %.2f deg C ",f,c);
	}

}
