package java_tamil_programming;

public class copyconstructor {
	int id,xid;
	String name,xname;
	public copyconstructor(int a,String b)
	{
		id=a;
		name=b;
		System.out.println("Constructor one "+a);
		System.out.println("Constructor one "+b);
	}
	public copyconstructor(copyconstructor s) 
	{
		xid=s.id;
		xname=s.name;
		System.out.println("\nConstructor two "+xid);
		System.out.println("Constructor two "+ xname);
	}
	public static void main(String[] args) {
		copyconstructor o=new copyconstructor(12,"copy");
		copyconstructor ob=new copyconstructor(o);
		
	}

}
