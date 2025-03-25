package com.java8.dateTimeApi;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.cglib.core.Local;

public class PeridoDuration {

	public static void main(String[] args) {
		
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(2022, 6, 13);
		System.out.println(date1.compareTo(date2));
		Period period = Period.between(date1, date2);
		System.out.println(period);
		System.out.println();
		
	}
}
