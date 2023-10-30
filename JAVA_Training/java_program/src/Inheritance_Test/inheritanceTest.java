package Inheritance_Test;

import Inheritance_Test.Car.fueltypes;

public class inheritanceTest {
	public static void main(String[] args) {
		/*
		 * Vehicle o=new Vehicle("Hero","black","suriya",1000); 
		 * o.display();
		 *  o=null;bho
		 */
		/*
		 * Cycle s=new Cycle("Hero bike","blue","suriya",1000,2);
		 *  s.display();
		 *   s=null;
		 */
		
		Car a=new Car("maruthi","white","suresh",200000,4,5,fueltypes.petrol);
		a.display();
		a=null;
	}

}
