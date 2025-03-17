package com.learn.stream;

import java.util.Comparator;
import java.util.List;

public class MinAndMax {

	public static void main(String[] args) {
		int val =0;
		List<Integer> list = List.of(2,4,6,7,2,68,1100,88,-3,-3);
		//Finding minmum value in the array
		val=list.stream().min((X,Y) -> X.compareTo(Y)).get();
		System.out.println(val);
		
		val= list.stream().max((a,b)->a.compareTo(b)).get();
		System.out.println(val);
		//Removing duplicates
		list.stream().distinct().forEach(System.out::println);
		System.out.println("Limiting the value to  3");
		list.stream().limit(3).forEach(System.out::println);
		
		System.out.println("Skiping the values");
		list.stream().sorted().limit(1).forEach(System.out::println);
		System.out.println("Skip and limit");
		list.stream().skip(3).limit(3).forEach(System.out::println);
		
		
		//Find second highest value
		System.out.println("Find second largest");
		List<Integer> newList = List.of(4,6,22,54,654,72,7456,0,2);
		newList.stream().sorted().skip(3).limit(1).forEach(System.out::println);
		
		
		
	}
}
