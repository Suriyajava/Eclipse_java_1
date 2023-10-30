package java_tamil_programming;
class Annauniversity
{
	void fess()
	{
		int fess =10000;
		System.out.println("Anna university fess"+fess);
	}
}
class paavai extends Annauniversity
{
	void fess ()
	{
		int fess=20000;
		System.out.println("Paavai clg fess"+fess);
	}
}
class Avs extends Annauniversity
{
	void fess()
	{
		int fess=30000;
		System.out.println("AVS clg fess"+fess);
	}
}
class muthayammal  extends Annauniversity
{
	
}
public class polymorphism {
	public static void main(String[] args) {
		paavai p=new paavai();
		Avs a=new Avs();
		muthayammal m=new muthayammal();
		p.fess();
		a.fess();
		m.fess();   
		
		
		
	}

}
