package C_Data_structrure;

import java.util.Scanner;

public class lucky_or_nonlucky {
	public static void main(String[] args) {
		
		Scanner l=new Scanner(System.in);
		int ar[]=new int[11];
		int v;
		String result=null, a="\"LUCKY\".", b="\"NON LUCKY\".";
		
		for(int i=1;i<11;i++)
		{
			ar[i]=i;
		}
		System.out.println("Enter the 1 to 10 any Number ");
		v=l.nextInt();
		for(int i=1;i<11;i++)
		{
			if(v==ar[i])
			{
				result=a;
				break;
			}
      		else 
				result=b;
			
		}
		System.out.println("Youer Enter "+v+" answer is "+result);
		l.close();
		
	}

}
