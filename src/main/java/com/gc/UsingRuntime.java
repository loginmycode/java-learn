package com.gc;

import java.net.MulticastSocket;
import java.time.LocalDate;

public class UsingRuntime {

	public static void main(String[] args) {
		
		Runtime r= Runtime.getRuntime();
		System.out.println("availableProcessors = "+r.availableProcessors());
		System.out.println("Total memory = "+r.totalMemory());
		System.out.println("freeMemory "+ +r.freeMemory());
		
		for(int i=0; i<1000; i++)
		{
			LocalDate date = LocalDate.now();
			//System.out.println(date);
			r.gc();
		}
		System.out.println("After some execution---------------");
		System.out.println("availableProcessors = "+r.availableProcessors());
		System.out.println("Total memory = "+r.totalMemory());
		System.out.println("freeMemory "+ +r.freeMemory());
		r.gc();
		System.out.println("freeMemory "+ +r.freeMemory());
		
		
		
	}
}
