package java_program;

import java.util.Scanner; 

public class Compound_interest {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		double p,r,n,i,result;
		
		System.out.println("Enter the Principal value :");
		p=s.nextDouble();
		System.out.println("Enter the Rate of Interest :");
		r=s.nextDouble();
		System.out.println("Enter the Number of Year : ");
		n=s.nextDouble();
		
		i=r/100;
		
		result = p* Math.pow(i+1,n);
		
		System.out.printf("Result %.2f",result);
		
	}

}
