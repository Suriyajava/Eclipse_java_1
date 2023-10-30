package abstracts;

import java.io.PrintStream;

public abstract class  Vehicle {
	
	PrintStream p=System.out;
	protected String make, color,owner;
	protected float price;
	
	public Vehicle()
	{
		make="";
		color="";
		owner="";
		price=0;
	}
	public Vehicle(String make,String color,String owner,float price)
	{
		this.make=make;
		this.color=color;
		this.owner=owner;
		this.price=price;
	}
	public void display()
	{
		p.println("vehicle Details");
		p.println("make :"+make);
		p.println("price : "+price);
		p.println("color :"+color);
		p.println("owner name :"+owner);
		
	}
	abstract float maximumspeed();
	
	
	public void finalize()
	{
		p=null;
	}

}
