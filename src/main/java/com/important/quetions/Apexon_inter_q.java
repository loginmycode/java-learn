package com.important.quetions;

import java.util.Arrays;

public class Apexon_inter_q {

	public static void main(String[] args) {
		
		System.out.println(findIsPalOrNot(11211));
		int [] arr= {4,46,33,21,3};
		System.out.println(addOddNumber(arr));
	}
		
	
	
	public static boolean findIsPalOrNot(int number)
	{
		int hold =number;
		int d1=0, d2=0, res=0;
		
		while(number>0)
		{
			d1=number%10;
			number=number/10;
			res=d1+res*10;
			
		}
		if(res==hold)
			return true;
		return false;
			
	}
	
	public static int addOddNumber(int [] arr)
	{
		Integer res =Arrays.stream(arr).filter(n->n%2!=0).sum();
		Arrays.stream(arr).distinct().sum();
		//Skip the first odd number
		
		int res1 = Arrays.stream(arr).filter(n->n%2!=0).skip(1).sum();
		System.out.println(res1);
		return res;
	}
	
	
}
