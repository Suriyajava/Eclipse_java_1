package java_tamil_programming;
class one 
{
	int a=10;
	int b=20;
	
}
class two extends one
{
	
	int c=a+b;
		void display()
	{
		System.out.println("a value a="+a);
		System.out.println("b value b="+b);
	}
		public two() {
			System.out.println("value c="+c);
		}
}

public class inheritance {
	public static void main(String[] args) {
		two obj=new two();
		obj.display(); 
		
		
		
	}

}
