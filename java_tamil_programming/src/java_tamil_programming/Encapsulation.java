package java_tamil_programming;
class Test
{
	 private int a;
	void display(int x)
	{
		a=x;
		System.out.println("Class int values "+a);
	}
	int add()
	{
	return a;
	}
}
public class Encapsulation {
	public static void main(String[] args) {
		Test obj=new Test();
		obj.display(70);
		int d=obj.add();
		System.out.println("Main method "+d);
		
		
	}

}
