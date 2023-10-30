package java_tamil_programming;

public class Exception_ {
	public static void main(String[] args) {
		int s=5595;
		String name ="hello";
		try
		{
		String a=s +name;
		}
		catch (Exception e) {
			
			System.out.println(e);
		}
		System.out.println(s);
		System.out.println(name);
		
		int z=30;
		int x=-5+88;
		int ss=0;
		try
		{
			 ss=z+x;
		}catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(ss);
		
	} 
	

}
