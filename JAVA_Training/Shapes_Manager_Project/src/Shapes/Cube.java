 package Shapes;

public class Cube extends Shape {
	double length,breadth,heigth;
	
	public Cube()
	{
		shapeType="Cube";
	}

	@Override
	public void getInput() {
      getShapeID();
      System.out.println("Enter Lendth: ");
      length=in.nextDouble();
      System.out.println("Enter Breadth: ");
      breadth=in.nextDouble();
      System.out.println("Enter Height");
      heigth=in.nextDouble();
      CalculateArea();
	}

	@Override
	public void CalculateArea() {
     SurfaceArea =2*(length*breadth+breadth*heigth+length*heigth);
	}

	@Override
	public String toString() {
		String out=String.format("%-10s %-10s %10.2f length:%-10.2f Breath:%-10.2f Height:%-10.2f",
				shapeType,shapeID,SurfaceArea,length,breadth,heigth);
		return out;
	}

	@Override
	public String toCSVString() {
		String out=String.format("%s, %s, %f, %f, %f, %f",
				shapeType,shapeID,SurfaceArea,length,breadth,heigth);
		return out;
	} 
	public void deserialize(String csv)
	{
	super.deserialize(csv);
	String tokens[]=csv.split(",");
	length=Double.parseDouble(tokens[3]);
	breadth=Double.parseDouble(tokens[4]);
	heigth=Double.parseDouble(tokens[5]);
	tokens=null;
	
	}


}
