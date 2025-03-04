package com.important.forinterview;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArray {

	public static void main(String[] args) {
		
		Integer [] arr = {3,4,5,7,24,75,23,6,4};
		
	
		
		List list =Arrays.stream(arr).sorted(Collections.reverseOrder()).collect(Collectors.toList());
		
		System.out.println(list);
		list = Arrays.stream(arr).sorted().collect(Collectors.toList());
		System.out.println(list);
		
		
		String [] arr1 = {"Hello","a","Good","come","okay","Apple"};
	   List list2 =	Arrays.stream(arr1).sorted().collect(Collectors.toList());
		System.out.println(list2);
		
		String word = "HelloWorld";
		
		
		
		
	}
}
