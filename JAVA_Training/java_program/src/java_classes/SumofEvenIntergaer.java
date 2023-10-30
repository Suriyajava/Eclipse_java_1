package java_classes;
public class SumofEvenIntergaer {
	public void read2()
	{
	double sum=0;
	for(int i=2;i<=100;i+=3)
	{
		if(i%5==0)
		{
			sum=sum+i;
			System.out.println("Sum= "+sum+" ");
		}
	}
	System.out.printf("Sum of Even Number %.2f",sum);
	}

}
