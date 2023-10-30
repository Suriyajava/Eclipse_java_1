package Shapes;

import java.util.Scanner;

public abstract class Shape {
	protected Scanner in=new Scanner(System.in);
	
	protected String shapeType;
	protected String shapeID;
	protected double SurfaceArea;
	
	abstract public void getInput();
	abstract public void CalculateArea();
	abstract public String toString();
	abstract public String toCSVString();
	
	public void deserialize(String csv)
	{
		String tokens[]=csv.split(",");
		shapeType=tokens[0];
		shapeID=tokens[1];
		SurfaceArea=Double.parseDouble(tokens[2]);
		tokens=null;
	}
	
	public  Shape()
	{
		shapeID="undefined";
	};
	public Shape(String shapeType,String shapeID)
	{
		this.shapeID=shapeID; 
		this.shapeType=shapeType;
	} 
	protected void getShapeID()
	{
	 	System.out.println("Enter Shape ID :");
	 	shapeID=in.next();
	}

}
