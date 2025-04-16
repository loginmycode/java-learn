package com.basic.numbersop;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		System.out.println("The total prime is = "+printPrime(100));
	}
	
	public static int printPrime(int number)
	{
		int count=0;
		for(int i=2; i<number; i++)
		{
			boolean b=false;
			for(int j=2; j<i; j++)
			{
				if(i!=j&&i%j==0)
				{
					b=true;
				}
			}
			if(!b)
			{
				count++;
				System.out.println(i);
			}
		}
		return count;
			
	}
	
}
