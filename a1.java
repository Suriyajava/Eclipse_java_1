import java.util.Scanner;
class a1
{
  public static void main (String args[])
  {
  Scanner ss=new Scanner(System.in);
  System.out.print("Enter A Number :");
    int a=ss.nextInt();
    for(int i=0;i<=a;i++)
      {  
    for(int j=i;j<=a;j++)
        {
          System.out.print(" ");
          }
     for (int j=0;j<=i;j++)
          {
      System.out.print(a);
          System.out.println((char)(a+64)+"");
           a=a-64;
         }
    System.out.println();
      }

  }

}