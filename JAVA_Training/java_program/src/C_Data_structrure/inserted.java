package C_Data_structrure;

public class inserted {

	public static void main(String[] args) {
  int a[]=new int [10];
  a[0]=10;
  a[1]=20;
  a[2]=30;
  a[3]=40;
  a[4]=60;
  a[5]=70;
  a[6]=80;
  a[7]=90;
  int n=8,k=4;
  for(int i=n-1;i>=k;i--)
  {
	a[i+1]=a[i];
	
  }
  a[k]=50;
  n=n+1;
  System.out.println("result");
  for(int i=0;i<n;i++)
  {
	  System.out.println(a[i]);
  }
  
	}

}
