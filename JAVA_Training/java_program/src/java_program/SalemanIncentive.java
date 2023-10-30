package java_program;

import java.util.Scanner;

public class SalemanIncentive {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double salesamount,incentive=0;
		System.out.println("Enter the sales amount");
		salesamount=sc.nextDouble();
		
		if(salesamount>=10000)
		incentive =salesamount *(10/100.0);
		
		System.out.printf("\n Incentive Amount is %.2f for salesAmount is %.2f ",incentive , salesamount);
	}

}
