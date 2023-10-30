package Shapes;

import java.io.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ShapesManager {
	ArrayList<Shape> shapes =new ArrayList<Shape>();
	
	String shapesFileName="E:/COLLECTIVA/files/shapes.txt";
	
	public enum  shapeTypes{Square,Rectangle,Cube,Circle};
	
	public ShapesManager()
	{
		boolean fileFound=new File(shapesFileName).isFile();
	     if(fileFound)
	     {
	    	 FileReader f=null;
	    	 try
	    	 {
	    		 f=new FileReader(shapesFileName);
	    		 BufferedReader br=new BufferedReader(f);
	    		 String buff;
	    		 
	    		 while ((buff = br.readLine())!=null) {
	    			 String tokens[]=buff.split(",");
	    			 Shape s=null;
	    			 switch (tokens[0]) {
					case "Square":
							s=new Square();
					break;
					case "Rectangle":
						s=new Rectangle();
						break;
					case "Cube":
						s= new Cube();
						break;
					case"Circle":
						s=new Circle(); 
						break; 
					}
	    			 s.deserialize(buff);
	    			 shapes.add(s);
				}
	    		 br=null; 
	    		 f.close();
	    		 
	    	 }catch (Exception e) {
	    		e.printStackTrace(); 
	    	 }
	    	 finally
	    	 {
	    		 f=null;
	    	 }
			}
	     }
	@Override
	protected void finalize() throws  Throwable{
		super.finalize();
	  shapes.clear();
		shapes=null;
		
	}
	public Shape getshape(String shapeID)
	{
		Shape res=null;
		for(Shape s:shapes)
		{
			String sid=s.shapeID.trim();
			if(sid.equals(shapeID))
			{
				res=s;
				break;
			}
		}
		
		return res;
	}
	public void deleteShape()
	{
		System.out.println("Delete Enter Shape ID:");
		Scanner in=new Scanner(System.in);
		String ShapeID=in.next();
		Shape s=getshape(ShapeID);
		
		if(s==null)
		{
			System.out.println("Invaid Shape Id!\n");
			return;
		}
		System.out.println(s.toString());
		System.out.println("Are you sure to delete object? (Y/N)");
		String opt=in.next();
		
		if(opt.toUpperCase().equals("Y"))
		{
			shapes.remove(s);
			System.out.println("\nShape ID is :"+ShapeID  +" DELETED");
			
			FileWriter f=null;
			try
			{
				f=new FileWriter(shapesFileName);
				BufferedWriter bw=new BufferedWriter(f);
				for(Shape s2:shapes)
				{
					bw.write(s2.toCSVString());
					bw.newLine();
				}
				bw.close();
				f.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				f=null;
			}
		}return;
	}
	public boolean AddShape(shapeTypes shapeType)
	{
		Shape s=null;
		switch (shapeType) {
		case Square: 
			s=new Square();
			break;
		case Rectangle:
			s=new Rectangle();
			break;
		case Cube:
			s=new Cube();
			break;
		case Circle:
			s=new Circle();
			break;
		}
		s.getInput();
		shapes.add(s);
		Addshape2File(s);
		s=null;
		return true;
	}
	private void Addshape2File(Shape s)
	{
		FileWriter f=null;
		try
		{
			f=new FileWriter(shapesFileName,true);
			BufferedWriter bw=new BufferedWriter(f);
			bw.write(s.toCSVString());
			//bw.write(s.toCSVString());
			bw.newLine();
			bw.close();
			f.close();
		}catch (Exception e) {
          e.printStackTrace();	
          }
		finally {
			f=null;
		}
	}
	public void  ListShapes()
	{
		System.out.println("List of Shapes");
		for(Shape s:shapes)
		{
			System.out.println(s.toString()); 
		}
	}
	

} 
