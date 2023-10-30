package java_tamil_programming;

public class variable_access {
	 int d=100;
	public static void main(String[] args) {
		
		int a=10;
		
		 
		System.out.println(a);
		variable_access e=new variable_access();
		variable_access e1=new variable_access();
		variable_access e2=new variable_access();
		e.display();
		e1.d=200;
		System.out.println(e1.d);
		e2.d=300;
		System.out.println(e2.d);
		System.out.println(e.d);
		 
	}
	void display()
	{
		int b=20;
		System.out.println(b);
		System.out.println(d);
	}
			
	

}
