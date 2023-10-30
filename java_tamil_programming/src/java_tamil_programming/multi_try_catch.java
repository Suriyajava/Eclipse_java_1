package java_tamil_programming;

public class multi_try_catch {
	public static void main(String[] args) {
		try
		{
			try
			{
				int a=191;
				int b=243/0;
				
			}catch (ArithmeticException e)
			{
				System.out.println("Arithment Exception");
			}
			try
			{
				int []a= {1,112,323,23};
				int b=a[4];
			
				
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array index out bounds exception");
			}
		}catch (Exception e) {
			System.out.println("Exception Handling");
			
		}
		System.out.println("Welcome");
	}

}
