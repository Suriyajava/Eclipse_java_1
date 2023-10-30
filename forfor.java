import java.util.Scanner;
class forfor
{
public static void main(String agrs[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter A number : !");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
	{
	for(int j=0;j<=i;j++)
		{
		System.out.println(i+ "  "+j+"  "+i);
	    }
   }


}
}