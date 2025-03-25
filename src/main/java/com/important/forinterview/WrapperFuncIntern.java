package com.important.forinterview;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

public class WrapperFuncIntern {

	public static void main(String[] args) {
		
		int num1=127;
		Integer num2 = 127;
		Integer num3 = 127;
		System.out.println(num1==num2);
		
		System.out.println(num2.hashCode());
		System.out.println(num3.hashCode());
		System.out.println(System.identityHashCode(num2));
		System.out.println(System.identityHashCode(num3));
		
		
		
		
		
		
		
		
	}
}
