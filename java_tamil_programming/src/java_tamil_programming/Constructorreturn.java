package java_tamil_programming;

public class Constructorreturn {
	int n1,n2;
	public Constructorreturn(int a,int b) {
		
		n1=a;
		n2=b;
	}
	public static void main(String[] args) {
		Constructorreturn o=new Constructorreturn(20, 70);
		int d=o.n1,c=o.n2;
		System.out.println("Values "+d+ " "+c);
	}
	

}
