package com.learn.features.java8.stramApi;

import java.nio.file.spi.FileSystemProvider;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNumber {

	public static void main(String[] args) {
		
		List<Integer> list =List.of(1,1,3,4,6,8,90,3,4,55,2);
		List<Integer> list1 =list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(list1);
		
		
		List<Integer> remDup =list.stream().distinct().collect(Collectors.toList());
		System.out.println(remDup);
		
		List<Integer> oddNumber =list.stream().filter(i->i%2!=0).collect(Collectors.toList());
		System.out.println(oddNumber);
		
		
		
	}
}
