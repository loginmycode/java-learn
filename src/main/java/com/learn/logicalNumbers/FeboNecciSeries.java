package com.learn.logicalNumbers;

public class FeboNecciSeries {

	public static void main(String[] args) {
		
		febboSeries(10);
				
	}
	
	public static void febboSeries(int num)
	{
		int i=0, n1=0, n2=1,n3=0;
		System.out.print(n1+ " "+n2);
		while(i<=num)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			i++;
			
			
		}
	}
}
