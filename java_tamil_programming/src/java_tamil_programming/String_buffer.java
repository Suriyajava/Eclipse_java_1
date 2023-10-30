package java_tamil_programming;

public class String_buffer {
	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("welcome");
		System.out.println(s.insert(0, " hello"));
		System.out.println(s.replace(1, 2,"java"));
		System.out.println(s.delete(2, 4));
		System.out.println(s.reverse());
	}

}
