package java_program;

import java.util.Scanner;

public class Switchcase {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int grade;
		double sales, basicsales;
		
		System.out.println("Enter the Basic sales");
		basicsales=s.nextDouble();
		
		System.out.println("Enter the Grade");
		grade=s.nextInt();
		
		switch(grade)
		{
		case 1:
			sales=basicsales +0.10*basicsales;
			break;
		case 2:
			sales=basicsales +0.20*basicsales;
			break;
		case 3:
			sales=basicsales +0.30*basicsales;
			break;
			
			default:
			sales=basicsales +0.30*basicsales;
		}
		System.out.printf("Result sales %.2f",sales);
	}

}
