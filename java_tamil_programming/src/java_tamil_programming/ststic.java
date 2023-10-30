package java_tamil_programming;

public class ststic {
	 int a;
	static int b=12;
	
	public ststic() {
		a+=10;
		b+=1;
		System.out.println("a = "+a);
		System.out.println("display a="+b);
	}
	static void  display()
	{
		System.out.println("b = "+b);
	}
	static {
		System.out.println("Static method");
		System.out.println("static block b= "+b);
	}
	public static void main(String[] args) {
		System.out.println("this is main method");
		ststic obj=new ststic();
		ststic obj1=new ststic();
		ststic obj2=new ststic();
		display();
		ststic.display();
	}

}
