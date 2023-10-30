package java_tamil_programming;
class a1
{
	int a=10;
	int c=20;
}
class b2 extends a1
{
	int b=20;
}
class c1 extends a1
{
   int e=a+c;
   c1()
   {
	   System.out.println("values "+e);
   }
}

public class hierarchical {
	public static void main(String[] args) {
		c1 o=new c1();
			}

}
