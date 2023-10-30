package java_tamil_programming;

public class String_comparision {
	public static void main(String[] args) {
		String s="suriya";
		String s1="Suriya";
		String s2="Begger";
		String s3=new String(s);
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s==s1);
		System.out.println(s.compareTo(s1));
	}

}
