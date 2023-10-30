package java_program;

public class Unformatted_output {

	public static void main(String[] args) {
		int a=21;
		int b=43;
		float x=232.23245678f;
		int c=a+b;
		
		System.out.print(a);
		System.out.print(b);
		System.out.print(c);
		System.out.print(x+"\n");
		
		System.out.printf("\n%d\n%d\n%d\n%15.2f",a,b,c,x);
		

	}

}
