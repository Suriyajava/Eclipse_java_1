package java_program;

import java.util.Scanner;

public class Basicpay {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int Grade;
		double basicsale, sale=0;
		System.out.println("Enter the Basic sales");
		basicsale=s.nextDouble();
		System.out.println("Enter the Grade :");
		Grade=s.nextInt();
		if(Grade <=1)
			sale =basicsale +basicsale *0.10;
		else if(Grade ==2)
			sale =basicsale +basicsale *0.20;
		else if (Grade==3)
		sale =basicsale +basicsale *0.30;
		else
		sale =basicsale +basicsale *0.40;
			
		
		System.out.printf("Sales %.2f",sale);
	}

}
