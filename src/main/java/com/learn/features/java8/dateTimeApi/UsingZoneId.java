package com.learn.features.java8.dateTimeApi;

import java.nio.file.spi.FileSystemProvider;
import java.time.DayOfWeek;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class UsingZoneId {

	public static void main(String[] args) {
		
		ZoneId usaZone = ZoneId.of("America/New_York");

        // Get the current time in the USA (New York)
        ZonedDateTime usaTime = ZonedDateTime.now(usaZone);
       
        System.out.println(usaTime);
        
        ZoneId indiaZone = ZoneId.of("Asia/Kolkata");
        ZonedDateTime indiaTime = ZonedDateTime.now(indiaZone);
        System.out.println(indiaTime);
        
        System.out.println(usaTime.getDayOfMonth());
        System.out.println(usaTime.getZone());
        
        
        LocalTime localTime = indiaTime.toLocalTime();
        System.out.println(localTime);
        System.out.println(localTime.MIDNIGHT);
        
        DayOfWeek day= DayOfWeek.FRIDAY;
        System.out.println(day);
        
       ZonedDateTime zone =  ZonedDateTime.now();
       System.out.println(zone.getZone());
	}
	
}
