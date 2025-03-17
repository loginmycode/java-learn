package com.important.forinterview;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class SkipAndLimit {

	public static void main(String[] args) {
		
		int [] arr = {4,54,234,5,245};
		Arrays.stream(arr).sorted().forEach(System.out::println);
		OptionalInt list =Arrays.stream(arr).sorted().findFirst();
		OptionalInt last =Arrays.stream(arr).min();
		System.out.println(Arrays.stream(arr).max());

		System.out.println(list);
		System.out.println(last);
		
		
	}
}
