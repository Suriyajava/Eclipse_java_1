package Inheritance_Test;

public class Cycle extends Vehicle{
	protected int wheelcount; 
	
	public Cycle()
	{
		super();
		wheelcount =0;
	}
	public Cycle(String make,String color,String owner,float price,int wheelcount)
	{
		super(make,color,owner,price);
		this.wheelcount =wheelcount;
	}
	@Override
	public void display()
	{
		super.display();
		p.println("Wheel count :"+wheelcount);
		
	}
}
