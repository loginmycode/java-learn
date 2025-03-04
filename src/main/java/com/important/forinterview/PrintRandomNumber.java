package com.important.forinterview;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PrintRandomNumber {

	public static void main(String[] args) {
		
		Random random = new Random();
		random.ints().limit(5).sorted().forEach(System.out::println);
		
		
		int [] arr = {4,5,6,7,22,77,99,13,88,00};
		
		int[] arr1 =Arrays.stream(arr).sorted().toArray();
		
		System.out.println(arr1.toString());
		
		
	}
}
