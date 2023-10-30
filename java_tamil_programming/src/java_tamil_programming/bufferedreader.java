package java_tamil_programming;

import java.io.*;

public class bufferedreader {
	public static void main(String[] args) throws IOException {
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		
		System.out.println("Enter the String");
		String s=br.readLine();
		
		System.out.println("Enter the Interger");
		int a=Integer.parseInt(br.readLine());
		
		System.out.println("Enter the Float");
		float b=Float.valueOf(br.readLine());
		
		System.out.println("String  "+s);
		System.out.println("Interger "+b);
		System.out.println("Float  "+b);
		
		
		
		
		
		
	}

}
