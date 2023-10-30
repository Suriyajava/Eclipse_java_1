package java_program;
import java.util.Scanner;
public class Salesincentiveifelse {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
	double sale,incentive=0;
	
	System.out.println("Enter the Sales Amount:");
	sale=s.nextDouble();
	
	if(sale<10000)
		incentive =0;
	else if(sale <=15000)
		incentive =sale *(10/100.0);
	else if(sale<=20000)
	incentive =sale *(15/100.0);
	else if(sale<=25000)
		incentive =sale *(25/100.0);
	else 
		incentive =sale *(30/100.0);
	
	
	System.out.printf("Incentive is %.2f  for sale is %.2f",incentive,sale);
		
		
		
	}
	

}
