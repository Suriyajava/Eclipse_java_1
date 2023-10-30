package org.jsp.Array;

import java.util.Scanner;

public class max {
public static void main(String[] args) {
	
	
	Scanner i=new Scanner(System.in);
	
	System.out.println("Ente an array size ");
	
	int n=i.nextInt();
	int [] arry =new int [n];
	System.out.println("values Enter");
	for(int k=0;k<n;k++)
	{
		arry[k]=i.nextInt();
	}
	int a=arry[0];
	int b=a;
	
	System.out.println("Result");
	for(int y=0;y<n;y++)
	{
		
		System.out.println(arry[y]);
	
	for(int f=0;f<n;f++)
	{
		if(a<arry[f])
		{
			a=arry[f];
		}if  (b>arry[f])
		{
			b=arry[f];
		}
	}
	
	}
	System.out.println("maxmam "+a);
	System.out.println("minimam "+b);
	i.close();
	
  }	





}
