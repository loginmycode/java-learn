package com.learn.features.java8.dateTimeApi;

import java.util.Calendar;
import java.util.TimeZone;

public class FindTheCountryTime {

	public static void main(String[] args) {
		
		TimeZone usa = TimeZone.getTimeZone("America/New_York");
		Calendar calendar = Calendar.getInstance(usa);
		Calendar cal =Calendar.getInstance();
		System.out.println(cal.FEBRUARY);
		System.out.println(cal.getCalendarType());
		System.out.println(cal.getMinimalDaysInFirstWeek());
		
	}
}
