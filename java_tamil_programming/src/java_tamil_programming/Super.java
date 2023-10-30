package java_tamil_programming;
class ab
{
	ab()
	{
		System.out.println("Constructor");
	}
  String name="First";
  void add()
  {
	  System.out.println("welcome");
  }
}
class ba extends ab
{
	 ba()
	 {
		 super();
	 }
	String name="second";
	void add()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
	void demo()
	{
		super.add();
	}
	
}


public class Super {
  public static void main(String[] args) {
	  ba obj=new ba();
	  obj.add();
	  obj.demo();
	  
			  
	
}

}
