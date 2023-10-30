
package java_classes;

import java.util.Scanner;

public class Heat_Analysis {
	public static void main(String[] args) {
	 Heat_ obj=new Heat_();
	 obj.main();
	 obj=null;
	}
}
class Heat_
{
	private int flag;
	private String heat;
	
	public void main()
	{ String s;
	    do {
	    	Scanner u=new Scanner(System.in);
		Heat_ o=new Heat_();
		o.read();
		o.funtion();
		o.display();
		o=null;
		System.out.println("\nEnter the Continue Y");
		s=u.nextLine();
	    }while(s.equalsIgnoreCase("Y"));
	}
	public int getFlag() {
		return flag;
	}
	public String getHeat() {
		return heat;
	}
	public void read()
	{
		Scanner i=new Scanner(System.in);
		System.out.println("Enter The  Heat Code (1-3)");
		flag=i.nextInt();
		i=null;
	}
	public String  funtion()
	{
		switch (flag) {
		case 1:
			heat ="HOT";
			break;
		case 2:
			heat ="LUKE WARM";
			break;
		case 3:
			heat ="COLD";
			break;
		default:
			heat ="OUT OF RANGE";
		}
		return heat;
	}
	public void display()
	{
		System.out.printf("Flag is %d Result is %s \n",flag,heat);
	}
	
}
