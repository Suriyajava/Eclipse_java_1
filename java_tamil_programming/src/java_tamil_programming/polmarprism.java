package java_tamil_programming;

public class polmarprism {
	void add()
	{
		int a=90;
		System.out.println("add first method a= "+a);
	}
	void add(int b,int c)
	{
		int  d=b+c;
		System.out.println("secod method d= "+d);
	}
	void add (double a,double b)
	{
		double c =a+b;
		System.out.println("three method c= "+c);
	}
	void add(long a)
	{
		System.out.println("fourth method a= "+a);
	}
	public static void main(String[] args) {
		polmarprism obj=new polmarprism();
		obj.add();
		obj.add(12,10);
		obj.add(12.5, 13.5);
		obj.add(100);
		
	}

}
