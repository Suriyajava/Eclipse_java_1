package java_tamil_programming;
interface father
{
	String fname ="Rajenderan";
	void father();
}
interface mother
{
	String mname="Manonmani";
	void mother();
}
class son implements father,mother
{  
	String name,fwork,mwork;
	son()
	{
		name="suriya";
	}
	@Override
	public void father()
	{
		fwork="former";
	}
	@Override
	public void mother() 
	{
		mwork="former and home maker";
	}
	void display()
	{
		System.out.println("father name :"+fname);
		System.out.println("mather name :"+mname);
		System.out.println("father work :"+fwork);
		System.out.println("mather work :"+mwork);
		System.out.println("son  name   :"+name);
	}
}
public class inheritance_multi {
	public static void main(String[] args) {
		son obj=new son();
		obj.father();
		obj.mother();
		obj.display();
		
	}

}
