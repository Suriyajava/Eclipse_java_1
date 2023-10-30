package java_classes;

import java.util.Scanner;

public class EncryptString {
	private String originalString, encryptString;

	public String getOriginalString() {
		return originalString;
	}

	public String getEncryptString() {
		return encryptString;
	}
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Original String ");
		originalString=sc.nextLine();
	}
	public String result() {
		encryptString =new String();
		encryptString="";
		char c;
		for(int i=0;i<originalString.length()-1;i++)
		{
			c=originalString.charAt(i);
			c=(char)((int)c-1);
			//encryptString = encryptString + Character.toString(c);
			encryptString  += Character.toString(c);
		}
		return encryptString;
	}
	void display() {
		System.out.printf("Encrypt String is \n %s",encryptString);
	}


}
