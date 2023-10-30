package C_Data_structrure;

public class twoarray {
	 static int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
	
	public static void main(String[] args) {
		
		print();
		colum();
		
	}
    static void print()
		{
			for(int i=0;i<3;i++)
			{
				System.out.println();
				
				for(int j=0;j<3;j++)
					System.out.print(a[i][j]);
					
			}
		}
    static void colum()
	{
    	System.out.println("\n\n");
		for(int i=0;i<3;i++)
		{
			System.out.println();
			
			for(int j=0;j<3;j++)
				System.out.println(a[i][j]);
				
		}
	}
}
