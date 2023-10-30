package java_tamil_programming;
class a
{
	int a=8;
}
class b extends a
{
   int  b=70;
}
class c extends b
{
	int c=a*b;
	void main()
	{
		System.out.println(c);
	}
}
public class inheritancemultipla {
	public class hierarchical {

	}

	public static void main(String[] args) {
		c o=new c();
		o.main();
	}

}
