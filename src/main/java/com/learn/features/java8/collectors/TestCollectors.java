package com.learn.features.java8.collectors;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TestCollectors {

	public static void main(String[] args) {
		
		String [] arr = {"radha", "Krishna", "Arjuna", "Drupati","Karna"};
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		String res = Arrays.stream(arr).collect(Collectors.joining(" , "));
		System.out.println(res);
	}
}
