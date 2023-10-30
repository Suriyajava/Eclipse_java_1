package java_tamil_programming;

abstract class clg
{
	 int salary;
	 private String name;
	void setname()
	{
		this.name="suriya";
	}
	String getname()
	{
		return this.name;
	}
	abstract void computeSalary();
	int getsalary()
	{
		return this.salary;
	}
}
class fulltime extends clg
{
	
	 void computeSalary()
	{
		
		salary=3*30;
	}
	
}
class parttime extends clg
{
	void computeSalary()
	{
		salary =4*50;
	}
}

public class Abstraction {
	public static void main(String[] args) {
		clg obj=new fulltime();
		obj.setname();
		String ename=obj.getname();
		obj.computeSalary();
		int esalary =obj.getsalary();
		System.out.println(ename);
		System.out.println(esalary);
	}

}
