package java_classes;

public class Pi_value {
	public static void main(String[] args) {
		pi o=new pi();
		o.read();
		o=null;
	}
}
class pi
{
	public void read()
	{
	int mf=1;
	double pi=0;
	for(int i=1,j=1;i<=100;j+=2,i++)
	{
		pi=pi+(mf)* (4.0/j);
		mf=mf * -1;
		
	}
	System.out.println("Pi values is "+pi);
	}
}
