package com.basic.numbersop;

public class Snippet {
	static String test(Object obj) {
	    return switch (obj) {
	        case Integer i -> "Integer";
	        case String s  -> "String";
	        default        -> "Unknown";
	    };
	}
}

