package Inheritance_Test;

public class Car extends Vehicle{
	enum fueltypes{petrol,diesel,gas};
	private int wheelcount,gears;
	private fueltypes fueltype;
	
	public Car()
	{
		super();
		wheelcount=0;
		gears=0;
	}
	public Car(String make,String color,String owner,float price,int wheelcount,int gears,fueltypes fueltype)
	{
		super(make, color, owner, price);
		this.wheelcount=wheelcount;
		this.gears=gears;
		this.fueltype=fueltype;
	}
	@Override
	public void display()
	{
		super.display();
		p.println("Wheel count :"+wheelcount);
		p.println("gears count :"+gears);
		p.printf("fuel type : %s",fueltype);
	}
	


}
