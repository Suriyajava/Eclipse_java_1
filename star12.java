import java.util.Scanner;
class star12
{
public static void main(String agrs[])
{
Scanner sc=new Scanner (System.in);
System.out.print("Enter a Star value= ");
   int n=sc.nextInt();

   for(int i=1;i<=n;i++)
   {

       for(int j=1;j<=n;j++)
	    {
            if(j==1||j==n ||i==j)
			{
		  System.out.print ("*");
            }
			else 

				System.out.print(" ");
	
	   }

       System.out.println();


    }

 }
  }
