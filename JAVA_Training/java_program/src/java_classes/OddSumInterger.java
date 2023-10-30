package java_classes;

public class OddSumInterger {  
	public static void main(String[] args) {
		main obj=new main();
		obj.display();
	}
}
 class main
{
	 private int sum;

	public int getSum() {
		return sum;
	}
 void display() 
 {
	 sum=0;
	 for(int i=2;i<=30;i+=2)
	 {
		 sum+=i;
	 }
	 System.out.println("Sum = "+sum);
 }
}
