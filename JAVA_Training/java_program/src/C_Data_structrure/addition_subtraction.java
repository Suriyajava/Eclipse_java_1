package C_Data_structrure;

public class addition_subtraction {
	int a[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
	int b[][]= {{10,20,30,40},{11,22,33,44},{55,66,77,88}};
	int c[][]= {{0,0,0,0},{0,0,0,0},{0,0,0,0}};
	public static void main(String[] args) {
		addition_subtraction obj=new addition_subtraction();
		obj.print();
		obj.sum();
		obj.prints();
		obj.multiplication();
		obj.prints();
		obj.column();
		obj=null;
		
	}
	void print()
	{
		System.out.println("Print the a values ");
		for(int i=0;i<a.length;i++)
		{ 
			System.out.println();
			for(int j=0;j<a[0].length;j++)
			{
				System.out.print(" "+a[i][j]);
			}
			
		}
		System.out.println("\n\nPrint the a values ");
		for(int i=0;i<b.length;i++)
		{ System.out.println();
			for(int j=0;j<b[0].length;j++)
			{
				System.out.print(" "+b[i][j]);
			}
			
		}
	}
	 void sum()
	 
	{
		// c =new int [a.length][a.length];
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=0;j<a[0].length;j++)
			 {
				 c[i][j]= a[i][j] + b[i][j];
			 }
		 }
	}
	  void prints()
	 {
		System.out.println("\nResult");
		 for(int i=0;i<c.length;i++)
			{ System.out.println();
				for(int j=0;j<c[0].length;j++)
				{
					System.out.print(" "+c[i][j]);
				}
				
			}
	 }
	  void multiplication()
		 {
			System.out.println("\nResult of Multiplication");
			for(int i=0;i<a.length;i++)
			 {
				 for(int j=0;j<a[0].length;j++)
				 {
					 for(int k=0;k<a.length;k++)
					 c[i][j]= c[i][j]+ a[i][k] * b[k][j];
				 }
					
				}
		 }
	  void column()
	  {
		  System.out.println("\n column");
		  for(int i=0;i<4;i++)
		  {
			  System.out.println();
			  for(int j=0;j<3;j++)
			  {
				 System.out.print(" "+c[j][i]); 
			  }
				  
		  }
	  }

}

