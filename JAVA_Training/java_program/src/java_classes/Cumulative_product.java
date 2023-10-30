package java_classes;

import java.util.Scanner;

public class Cumulative_product {
	public static void main(String[] args) {
		Cumulative obj=new Cumulative();
		obj.main();
		obj=null;
	}
}
class Cumulative
{
	private double product,temp;
	private int n;
	private String a;
	Scanner sc=new  Scanner(System.in);
	public void main()
	{
		do {
			Cumulative o=new Cumulative();
			o.read();
			o.sum();
			o.display();
			o=null;
			System.out.println("\nDO YOU PROGRAM CONTINUE CLICK Y");
			a=sc.next();
		}while(a.equalsIgnoreCase("y"));
	}
	public double getProduct() {
		return product;
	}
	public double getTemp() {
		return temp;
	}
	public int getN() {
		return n;
	}
	public String getA() {
		return a;
	}
	public int  read()
	{
		System.out.println("Enter the Cumulative Number of  ");
		n=sc.nextInt();
		return n;
	}
	public double sum() {
		product =1;
		for(int i=1;i<=n;i++)
		{
			System.out.println("Next Number."+i+" ?");
		 temp=sc.nextDouble();
		 product *=temp;
		 
		}
		return product;
	}
	public void display()
	{
		System.out.printf("CUMULATIVE TOTAL %.2f\n",product);
	}
}
