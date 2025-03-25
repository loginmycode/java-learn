package com.java8.basic;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		Optional<String> opt = Optional.of("Java");
        System.out.println(opt.get()); // Prints "Java"

        // Using isPresent() to check if value exists
        if (opt.isPresent()) {
            System.out.println("Value: " + opt.get()); // Prints "Value: Java"
        }

        // Using ifPresent() (preferred way)
        opt.ifPresent(value -> System.out.println("Value exists: " + value));
        
        
        Optional<String> opt2 = Optional.empty();

        // Using orElse() (always evaluates default value)
        String result1 = opt2.orElse("Default Value");
        System.out.println(result1); // Prints "Default Value"

        // Using orElseGet() (evaluates only if Optional is empty)
        String result2 = opt2.orElseGet(() -> "Generated Default");
        System.out.println(result2); // Prints "Generated Default"
	}
}
