package Shapes;

public class Square extends Shape {
	double side;

	public Square()
	{
		shapeType="Square";
	}
	@Override
	public void getInput() {
		getShapeID();
		System.out.println("Enter the side length:");
		side=in.nextDouble();
		CalculateArea();
	}

	@Override
	public void CalculateArea() {
		SurfaceArea=side*side;

	}

	@Override
	public String toString() {
		String out=String.format("%-10s %-10s %10.2f side:%-10.2f",
				shapeType,shapeID,SurfaceArea,side);
		return out;
	}

	@Override
	public String toCSVString() {
	 String out=String.format("%s, %s, %f, %f",
			 shapeType,shapeID,SurfaceArea,side );
		return out;
	}
	public void deserialize(String csv)
	{
		super.deserialize(csv);
		String tokens[]=csv.split(",");
		side = Double.parseDouble(tokens[3]);
		tokens=null;
	}

}
