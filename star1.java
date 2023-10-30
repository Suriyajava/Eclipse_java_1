import java.util.Scanner;
class star1
{
public static void main(String agrs[])
{
Scanner sc=new Scanner (System.in);
System.out.print("Enter value");
int q=sc.nextInt();
for(int i=1;i<=q;i++)
   {
 for(int j=1;j<=q-i;j++)
           {
System.out.print(" ");
             }
              int x=1;
	      for(int j=1;j<=i;j++)
	      {
            System.out.print(x+"    ");
                  x=x*(i-j)/j;
		  }
		  System.out.println();
     } 
}
}