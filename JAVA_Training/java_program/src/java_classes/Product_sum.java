package java_classes;

public class Product_sum {
	public static void main(String[] args)
	{
		mainprogram obj=new mainprogram();
		obj.result();
		obj=null;
		
	}
}
 class mainprogram
{
	 private int sum;

	public int getSum() {
		return sum;
	}
void result()
{
	sum=1;
	for(int i=1;i<=15;i++)
	{
		if(i%2==0)
		{
			//System.out.println(i);
		}
		else 
			
		{
			sum*=i;
			System.out.println("SUM ="+i);
		}
	}
	System.out.printf("Final Result %d",sum);
}
	
}
