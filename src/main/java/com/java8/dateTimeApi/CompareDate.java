package com.java8.dateTimeApi;

import java.time.LocalDate;

public class CompareDate {

	public static void main(String[] args) {
		

		LocalDate localDate1 = LocalDate.of(2025, 2, 28);
		LocalDate localDate2 = LocalDate.of(2025, 3, 2);
		
		
		if(localDate1.isAfter(localDate2))
		{
			System.out.println(localDate1+ " is After "+ localDate2);
		}
		else
		{
			System.out.println(localDate2+ " is After "+ localDate1);
		}
	}
}
