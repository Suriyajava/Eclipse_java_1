package abstracts;

import abstracts.Car.fueltypes;

public class Main {
	public static void main(String[] args) {
		/*
		 *  Vehicle s=new Vehicle();
		 *   */
		/*
		 * Vehicle v;
		 * 
		 * v=new Car("BMW","red","ananth",200000,4,6,fueltypes.diesel);
		 *  v.display();
		 * System.out.println("\nMaximum speed :"+v.maximumspeed());
		 *  v=null;
		 */
		IVehicle o=new Car();
		Vehicle y=new Car("BMW","red","ananth",200000,4,6,fueltypes.diesel);
		y.display();
		System.out.println("\nSeeting capacity :"+o.seetingcapacitiy());
		y=null; o=null;
		
	}

}
