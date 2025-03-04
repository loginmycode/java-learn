package com.learn.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDupNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,3,4,2,45,6,2,53,53);
		Set<Integer> set = new HashSet<>();
		
		List<Integer> res =  list.stream().filter(set::add).collect(Collectors.toList());
		
		System.out.println(res);
	}
	
}
