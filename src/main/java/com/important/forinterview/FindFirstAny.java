package com.important.forinterview;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class FindFirstAny {

	public static void main(String[] args) {
		
		int [] number= {45,764,46,5,675,4,532};
		 Optional<Integer> first = Optional.empty();
	        System.out.println("findFirst: " + first.orElse(-1));
				
		}
	
}
