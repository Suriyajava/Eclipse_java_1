import java.util.Scanner;
class Character 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter The Value of N:!");
		Scanner sc=new Scanner (System.in);

		int n=sc.nextInt();

		for(int i=1;i<=n;i++)
		{
			for(int j= 1;j<=n;j++)
			{
				//System.out.print((char)(i+64)+" ");
				System.out.print((char)(i+64)+" ");

			}
			System.out.println();
			 
		}
		 

	}
}
