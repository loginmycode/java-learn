package com.important.forinterview;

import java.util.Arrays;

public class BinaryOperation {

	public static void main(String[] args) {
		
		int [] arr= {0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,0};
		int p1=0, p2=arr.length-1;
		
		for(int i=0; i<arr.length; i++)
		{
			
			if(p1<p2)
			{
			
				if(arr[p1]==0&&arr[p2]==1)
				{
					int temp1=arr[p1];
					
					arr[p1]=arr[p2];
					arr[p2]=temp1;
					
					p1++;
					p2--;
					
					
				}
				else if(arr[p1]==1&&arr[p2]==0)
				{
					p1++;
					p2--;
				}
				else if(arr[p2]==0)
				{
					p2--;
					
				}
				else if(arr[p1]==1)
				{
					p1++;
				}
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}
}
