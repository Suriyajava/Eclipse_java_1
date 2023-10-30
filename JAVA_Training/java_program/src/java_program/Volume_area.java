package java_program;

import java.util.Scanner;

public class Volume_area {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		double v,a,r;
		System.out.println("Enter the Volume :");
        r=s.nextDouble();
        
		v=4*(22/7.0)*(r*r*r)/3;
        a=4*(22/7.0)*r*r;
        System.out.printf("  Volume Result %.2f",v);
        System.out.printf("\nArea  Result %.2f",a);
	
	}
	

}
