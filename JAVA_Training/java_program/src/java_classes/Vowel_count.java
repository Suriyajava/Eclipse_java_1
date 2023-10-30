package java_classes;

import java.util.Scanner;

public class Vowel_count {
	public static void main(String[] args) {
		
		String a;
		do {
		vowel sc=new vowel();
		Scanner z=new Scanner(System.in);
		sc.readinput();
		sc.result();
		sc.display();
		sc=null;
		System.out.println("Do you Continue Y");
		a=z.next();
		}while(a.equalsIgnoreCase("y")); // while(s.equalsIgnoreCase("Y")); 
	}
}
class vowel{
	private String text;
	private int vowel,letter;

	public String getText() {
		return text;
	}
	public int getVowel() {
		return vowel;
	}

	public int getLetter() {
		return letter;
	}
	void readinput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter charaters");
		text=sc.nextLine();
		sc=null;
	}
	void result()
	{ 
		char c;
		for(int i=0;i<text.length();i++)
		{
			c=text.charAt(i);
			if((c>='a'&&c<='z')||(c<='Z'&&c>='A'))
			{
			switch(c)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'I':
			case 'O':
			case 'U':
			case 'E':
			vowel ++;
				break;
		 default:
		  letter++;
			}
			}
		}
	}
	void display() 
	{
		System.out.println("Consonant Conut is :"+letter);
		System.out.println("Vowel Count is     :"+vowel);
	}
}