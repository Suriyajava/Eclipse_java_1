package java_tamil_programming;


class  child
{
	int a=10;
	final int b=70;
	void display()
	{
		a=30;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
	}
}
	class parent extends child
	{
		
		public void parent() {
		display();
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}

public class Final {
	public static void main(String[] args) {
		child obj=new child();
		obj.display();
		
	}

}
