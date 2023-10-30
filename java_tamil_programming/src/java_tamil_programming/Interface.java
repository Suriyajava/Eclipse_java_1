package java_tamil_programming;
interface employee
{
	String name="Interface ";
	void salary();
}
class ai implements employee
{ 
	int salary;
	@Override
	public void salary() {
		salary =3*10;
	}
	void Display()
	{
		System.out.println("Name :"+name);
		//System.out.println("Salary:"+salary);
	}
	
}
public class Interface {
	public static void main(String[] args) {
		ai obj=new ai();
		obj.salary();
		obj.Display();
	}

}
