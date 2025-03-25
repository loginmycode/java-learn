package com.java8.basic.methodRefrene;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

public class MethodRef{

	public static void main(String[] args) {
		
		List<String> list =List.of("Rama", "Seeta","Hanuman","Laximan","Kaike");
		
		list.forEach(System.out::println);
		
		
		int [] arr= new int[] {2,3,4,5,6,7,23,545,343,775,4};
		Arrays.stream(arr).forEach(System.out::println);
		
	}


}
