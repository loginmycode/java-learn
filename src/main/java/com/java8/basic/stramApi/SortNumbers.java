package com.java8.basic.stramApi;

import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers {

	public static void main(String[] args) {
		
		List<Integer> list =List.of(4,6,7,2,99,55,12,445,12,5,3);
		System.out.println(list);
		list =list.stream().sorted().collect(Collectors.toList());
		System.out.println(list);
		
		
		
	}
}
