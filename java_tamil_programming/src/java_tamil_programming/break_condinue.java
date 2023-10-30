package java_tamil_programming;

import java.util.Iterator;

public class break_condinue {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			if(i==9)
			{
				break;
			}
			else if (i==6)
			{
				continue;
			}
			System.out.println("for "+i);
		}
		
	}

}
