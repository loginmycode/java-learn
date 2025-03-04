package com.important.forinterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckFinalInt {

	public static void main(String[] args) {
		
		//final int i=5;
		//i++; you cant modify the value
		// System.out.println(i);
		
		//final List a= new ArrayList();
		//a.add("Hello");
		//System.out.println(a);
		
		
		final int [] arr= new int [10];
		for(int i=0; i<10; i++)
		{
			arr[i]=i;
		}
		System.out.println(Arrays.toString(arr));
	}
}
