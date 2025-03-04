package com.important.forinterview;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChronoUnitFunc {

	

	
	    public static void main(String[] args) {
	        LocalDate startDate = LocalDate.of(2023, 1, 1);
	        LocalDate endDate = LocalDate.of(2025, 3, 3);

	        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
	        long monthsBetween = ChronoUnit.MONTHS.between(startDate, endDate);
	        long yearsBetween = ChronoUnit.YEARS.between(startDate, endDate);

	        System.out.println("Days Between   : " + daysBetween);
	        System.out.println("Months Between : " + monthsBetween);
	        System.out.println("Years Between  : " + yearsBetween);
	    
	}

}
