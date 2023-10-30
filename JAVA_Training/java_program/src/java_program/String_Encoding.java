package java_program;

import java.util.Scanner;

public class String_Encoding {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s,result="";
		System.out.println("Enter letters");
		s=sc.nextLine();
		
		int a;
		char c;
		a=s.charAt(0);
		System.out.println("a="+a);
		a=a-1;
		c=(char)a;
		result =Character.toString(c);
		
		
		result +=Character.toString((char)(s.charAt(0)-1));
		result +=Character.toString((char)(s.charAt(1)-1));
		result +=Character.toString((char)(s.charAt(2)-1));
		result +=Character.toString((char)(s.charAt(3)-1));
		result +=Character.toString((char)(s.charAt(4)-1));
		System.out.println(result);
		
		
	}

}
