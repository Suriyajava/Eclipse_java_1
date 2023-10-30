package java_tamil_programming;

import java.util.Scanner;

class student
{
	int id;
	String name;
	int age;
	int mark1;
	int mark2;
	public student(int i,String n,int a,int m1,int m2)
	{
		id=i;
		name=n;
		age=a;
		mark1=m1;
		mark2=m2;
		
	}
	void display()
	{   System.out.println("-------Result-------\n");
		System.out.println("ID          : "+id);
		System.out.println("NAME        : "+name);
		System.out.println("AGE         : "+age);
	}
	void total()
	{
		int total=mark1+mark2;
		System.out.println("TAMIL MARK  : "+mark1);
		System.out.println("ENGLISH MARK: "+mark2);
		System.out.println("TOTAL MARK  : "+total);
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
	}
	
}

public class objectandclass {

	public static void main(String[] args) {
		int i ,a ,m1 ,m2 ;
		String n ;
		Scanner c=new Scanner(System.in);
		System.out.println("Enter the ID");
		i=c.nextInt();
		System.out.println("Enter the NAME");
		n=c.next();
		System.out.println("Enter the AGE");
		a=c.nextInt();
		System.out.println("Enter the MARK TAMIL");
		m1=c.nextInt();
		System.out.println("Enter the MARK ENGLISH");
		m2=c.nextInt();
		
		student obj=new student(i, n, a, m1, m2);
		 obj.display();
		 obj.total();

	}

}
