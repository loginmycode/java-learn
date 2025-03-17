package com.learn.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortDistinct {

	public static void main(String[] args) {
		
		List<String> list = List.of("Hello","Hi","Good","How","Are");
		list.stream().sorted().forEach(System.out::println);
		List<String> list2 =list.stream().filter(e ->e.length()>2).collect(Collectors.toList());
		System.out.println(list2);
		List<String> listed = List.of("A","B","Y","X","M");
	//	list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		List<String> list3 =listed.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("---"+list3);
	} 
}
