package java_classes;

import java.util.Scanner;

public class Text_Analysis {
	public static void main(String[] args) {
		a i=new a();
		i.readtext();
		i.result();
		i.result_();
		i=null;
	}
}
class a{
	 private String text;
	 private int tetter,digited,space,other;
	public String getText() {
		return text;
	}
	
	public int getTetter() {
		return tetter;
	}
	
	public int getDigited() {
		return digited;
	}
	public int getSpace() {
		return space;
	}
	
	public int getOther() {
		return other;
	}
	void readtext()
	{
		Scanner e=new Scanner(System.in);
		System.out.println("Enter any ");
		text=e.nextLine();
		e=null;
	}
	void result()
	{
		char c;
		for(int i=0;i<text.length();i++)
		{
			c=text.charAt(i);
			
			if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
			{
			 tetter++;
			}
			else if(c<='9'&&c>='0')
			{
				digited++;
			}
			else if(c==' '||c=='\n'||c=='\t')
			{
				space++;
			}
			else 
				other++;
		}
	}
	void result_()
	{
		System.out.println("Letters Count :"+tetter);
		System.out.println("Digites Count :"+digited);
		System.out.println("Space Count   :"+space);
		System.out.println("Other Count   :"+other);
	}

}
