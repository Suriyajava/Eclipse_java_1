import java.util.Scanner;
class star11
{
public static void main(String agrs[])
{
Scanner sc=new Scanner (System.in);
System.out.println("Enter a Star value= ");
   int n=sc.nextInt();

   for(int i=1;i<=n;i++)
   {

       for(int j=1;j<=n;j++)
	   {

		   if (i==2 && j==3 ||i==3&&j==2||i==4&&j==3||i==3&&j==4)
	 
       System.out.print("o ");
	   else 
		   System.out.print ("* ");


}

       System.out.println();


    }

 }
  }
