package java_classes;
import java.util.Scanner;
public class SmallestOfIntegers {
	public static void main(String[] args) {
	smallset ol=new smallset();
	ol.display();
	ol=null;
	}
}
class smallset
{
	void display()
	{
		int n,small =0,t;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the N");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			t=sc.nextInt();
			if(i==1)
			{
				small=t;
			}
			else 
			{
				if(small>t)
				{
					small =t;
				}
			}
		}
		System.out.println("Smallest Number "+small);
	}
}
