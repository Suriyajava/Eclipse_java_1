import java.util.Scanner;
class nu1
{
public  static void main (String []args)
{
Scanner sc=new Scanner(System.in);
System.out.print(" N Value=");
int n=sc.nextInt();

for(int i=1;i<=n;i++)
{    
	System.out.println();
	for(int j=1;j<=i;j++)
          System.out.print("*");
}
}
}