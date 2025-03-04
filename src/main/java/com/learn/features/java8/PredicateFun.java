package com.learn.features.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateFun {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("John", "Alice", "Bob", "Michael", "Tom");
		Predicate<String> predicate =str ->str.length()>2;
		System.out.println(predicate);
		
		names =names.stream().filter(predicate).collect(Collectors.toList());
		System.out.println(names);
	}
}
