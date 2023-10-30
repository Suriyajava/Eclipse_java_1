 package Shapes;

public class Rectangle extends Shape {
	double length,breadth;
	
	public Rectangle()
	{
		shapeType="Rectangle";
	}

	@Override
	public void getInput() {
		getShapeID();
		System.out.println("Enter Length: ");
		length=in.nextDouble();
		System.out.println("Enter breadth: ");
		breadth=in.nextDouble();
		CalculateArea(); 
       
	}

	@Override
	public void CalculateArea() {
		SurfaceArea=length*breadth;
	}

	@Override
	public String toString() {
		String out=String.format("%-10s  %-10s %10.2f Length:%-10.2f Breadth:%-10.2f",
				shapeType,shapeID,SurfaceArea,length,breadth);
		return out;
	}

	@Override
	public String toCSVString() {
		String out =String.format("%s, %s, %f, %f, %f",shapeType,shapeID,SurfaceArea,length,breadth);
		return out;
	}
	public void deserialize(String csv)
	{
		super.deserialize(csv);
		String tokens[]=csv.split(",");
		length = Double.parseDouble(tokens[3]);
		breadth =Double.parseDouble(tokens[4]);
		tokens=null;
	}

}
