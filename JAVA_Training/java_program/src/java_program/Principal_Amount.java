package java_program;

import java.io.PrintStream;
import java.util.*;

public class Principal_Amount {
	public static void main(String[] args) {
		PrintStream c=System.out;
		Scanner in;
		in=new Scanner(System.in);
		
		int NumberOfYear;
		double PrincipalAmount,RateOfInterest;
		
		c.println("Enter the Principal Amount :");
		PrincipalAmount=in.nextDouble();
		
		c.println("Enter the Rate Of Interest :");
		RateOfInterest=in.nextDouble();
		
		c.println("Enter the Number Of Year :");
		NumberOfYear=in.nextInt();
		
		double sum =PrincipalAmount*NumberOfYear*RateOfInterest/100;
		c.printf("Simple Interest =%.2f",sum);
		
		
	}

}
