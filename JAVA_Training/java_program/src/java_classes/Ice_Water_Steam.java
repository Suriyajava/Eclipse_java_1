package java_classes;

import java.util.Scanner;

public class Ice_Water_Steam {
public static void main(String[] args) {
	sub obj=new sub();
	obj.main();
	obj=null;
    }
}
class sub
{
	Scanner o=new Scanner(System.in);
	private int temp;
	private String a,re;
	public void main()
	{ do {
		sub f=new sub();
		f.read();
		f.sum();
		f.result();
		f=null;
		System.out.println("\nCONTINUE Y CLICK ");
		a=o.nextLine();
	  }while(a.equalsIgnoreCase("Y"));
	}
	public String getA() {
		return a;
	}
	public String getRe() {
		return re;
	}
	public int getTemp() {
		return temp;
	}
	public int read()
	{
		System.out.println("Enter The Number ");
	     temp=o.nextInt();
		return temp;
	}
	public String sum()
	{
		if(temp < 0)
		{
			re="ICE";
		}
		else if (temp <=100) {
			re="WATER";
		}
		else
		{
			re="STEAM";
		}
		return re;
	}
	public void result()
	{
		System.out.println("FINAL RESULT IS  "+re);
	}
}
