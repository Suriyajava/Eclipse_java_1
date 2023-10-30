class Drink 
{
	String brand;
	int price;
   Drink (String b ,int p)
	{
		this.brand=b;
		this.price=p;

	}
	public static void main(String[] args) 
	{
		Drink d1=new Drink("king",1000);
		Drink d2=new Drink("lemon",2000);

		System.out.println(d1.brand);
		System.out.println(d2.price);
	}
}
