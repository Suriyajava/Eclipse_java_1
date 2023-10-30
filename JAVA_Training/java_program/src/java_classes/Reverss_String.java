package java_classes;
import java.util.Iterator;
import java.util.Scanner;
public class Reverss_String {
	public static void main(String[] args) {
		fina obj=new fina();
		obj.main();
		obj=null;
	}
}
 class fina
{
	private String text,reverse,n;
	Scanner sc=new Scanner(System.in);
	public void main()
	{
		do {
	     fina o=new  fina();
		o.read();
		o.sum();
		o.display();
		o=null;
		System.out.println("\nDO YOU CONTINUE Y");
		n=sc.next();
		}while(n.equalsIgnoreCase("Y"));
	}
	public String getText() {
		return text;
	}

	public String getReverse() {
		return reverse;
	}

	public String getN() {
		return n;
	}
	public void read()
	{
		System.out.println("Enter the text");
		text=sc.nextLine();
		sc=null;
	}
	public String sum()
	{
		char c;
		reverse="";
		for (int i = 0; i<text.length(); i++)
		{
			c=text.charAt(i);
			reverse=Character.toString(c)+reverse;
			//System.out.println(reverse);
		}
		return reverse;
	}
	public void display()
	{
		System.out.println("REVERSE TEXT \n"+reverse);
	}
	
}
