package java_tamil_programming;

class this1
{
	int num1,num2;
	public this1(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	void display()
	{
		System.out.println("NUM1 = "+num1);
		System.out.println("NUM2 = "+num2);
	}

	
}

public class thisdemo {
	public static void main(String[] args) {
		this1 o=new this1(122, 1922);
		o.display();
		
	}

}
