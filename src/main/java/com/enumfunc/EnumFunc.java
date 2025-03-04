package com.enumfunc;

import java.time.LocalDate;

public class EnumFunc {

	public static void main(String[] args) {
		
		enum Day {Sunday, Monday, Tuesday,Wednesday, Thursday, Friday,Saturday}
		
		Day today= Day.Monday;
		System.out.println(today);
		LocalDate day = LocalDate.now();
        //
        // Add 5 days
        // LocalDate futureDate = today.plus(5, ChronoUnit.DAYS);
		
		
		
	};
}
