package com.important.quetions;

import java.util.Arrays;

public class RemoveDuplicateNumber {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,6,2,3,4,99};
		
		int [] uniqueNumber =Arrays.stream(arr).distinct().toArray();
		System.out.println(Arrays.toString(uniqueNumber));
	}
}
