package java_tamil_programming;

import java.util.Scanner;

public class method_argument {
   public static void main(String[] args) {
	  
	   method_argument o=new method_argument();
	   Scanner sc=new  Scanner(System.in);
	   
	  double  a,b;
	   System.out.println("Enter the value of A:");
	   a=sc.nextDouble();
	   System.out.println("Enter the value of B:");
	   b=sc.nextDouble();
	   o.sum(a, b);
	   
   }
   void sum( double a,double b)
   {
	  double c,d,e,f;
	   c= a+b;
	   d= a-b;
	   e= a%b;
	   f= a/b;
	   
	   System.out.println("A+B= "+c);
	   System.out.println("A-B= "+d);
	   System.out.println("A%B= "+e);
	   System.out.println("A/B= "+f);
   }
}
