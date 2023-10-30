package java_tamil_programming;

class constructor1
{
	public constructor1() {
		System.out.println("Default Constructor");
	}
	constructor1(int a)
	{
		System.out.println("intger Constructor ="+a);
	}
	constructor1(String b)
	{
		System.out.println("String Constructor "+b);
	}
	constructor1(double c)
	{
		System.out.println("Double Constructor "+c);
	}
	constructor1(long d)
	{
		System.out.println("long Constructor "+d);
	}
}

public class Constructortype {
	public static void main(String[] args) {
		constructor1 o=new constructor1();
		constructor1 ob=new constructor1(1000);
		constructor1 obj=new constructor1("value pass");
		constructor1 obj1=new constructor1(202.1212);
		constructor1  obj2=new constructor1(32323.23);
		
		
	}

}
