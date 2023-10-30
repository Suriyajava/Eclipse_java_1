package java_program;

import java.util.Scanner;

public class AreaOfCircle {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	float r,area;
	
	System.out.println("Enter the Radius of circle : ");
	r=sc.nextFloat();
	
	area =(float) ((22/7.0)*r*r);
	
	System.out.printf("Area of Circle With Radius %.2f is  %.2f ",r,area);
}
}
