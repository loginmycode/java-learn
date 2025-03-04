package com.important.forinterview;

import java.util.Arrays;

public class SumTheNumbers {

	public static void main(String[] args) {
		
		int [] arr = {3,5,6,7,3,46,7,8};
		
		int res =Arrays.stream(arr).sum();
		System.out.println(res);
		
		
	}
}
