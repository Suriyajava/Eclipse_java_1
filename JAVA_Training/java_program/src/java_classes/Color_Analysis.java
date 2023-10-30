package java_classes;
import java.util.Scanner;
public class Color_Analysis {
	public static void main(String[] args) {
   colors obj=new colors();
   obj.main();
   obj=null;
	}
}
class colors
{
	Scanner i=new Scanner(System.in);
	private String color;
	private String n;
	String a;
	public void main()
	{ 
		do {
		colors o=new colors();
		o.read();
		o.sum();
		o.result();
		o=null;
		System.out.println("\nTHE PROGRAM IS CONTINUE YOU CLICK Y && y ?");
		a=i.nextLine();
		}while(a.equalsIgnoreCase("Y"));
	}
	public String getColor() {
		return color;
	}
	public String getN() {
		return n;
	}
	public String read()
	{
		System.out.println("Enter your color ");
		n=i.nextLine();
		i=null;
		return n;
	}
	public String sum()
	{
		switch (n) { 
		case "r":
		case "R":
			color ="RED";
			break;
		case "g":
		case "G":
			color ="GREEN";
			break;
		case "b":
		case "B":
			color="BLUE";
			break;
		default:
			color="BLACK";
		}
		return color;
	}
	public void result()
	{
		System.out.println("YOUR COLOR IS "+color);
	}
}
