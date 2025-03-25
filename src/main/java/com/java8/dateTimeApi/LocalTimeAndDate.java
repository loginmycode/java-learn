package com.java8.dateTimeApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimeAndDate {

	public static void main(String[] args) {
		
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		
		LocalDate date = LocalDate.now();
		System.err.println(date);
		
		System.out.println(date.plusDays(10));
		System.out.println(date.minusDays(10));
		System.out.println(date.plusMonths(2));
		System.out.println(date.minusMonths(1));
	}
}
