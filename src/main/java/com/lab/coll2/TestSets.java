package com.lab.coll2;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestSets {

	/*
	 * Conclusion
	 * Use HashSet when order does’t matter and you need fast operations.
	 * Use LinkedHashSet when you need to maintain insertion order.
	 * Use TreeSet when you need a sorted set. 
	 */
	public static void main(String[] args) {
		
		testHashSet();
		testLinkedHashSet();
		testTreeSet();
	}
	public static void testHashSet()
	{
		//Null  alloweed
		// HashSet Gives Rander order
		//Uses internally HashMap
		System.out.println("-------------------------HashSet------------------------");
		Collection col = new HashSet<>();
		col.add("Banana");
		col.add("Apple");
		col.add("Mango");
		col.add("Lemon");
		col.add("orange");
		col.add("Apple");
		col.add(null);
		System.out.println(col);
		
		
		
	}
	public static void testLinkedHashSet()
	{
		//Internally used LinkedHashMap
		//Null  alloweed
		// LinkedHashSet Gives insertion order
		System.out.println("-------------------------LinkedHashSet------------------------");
		Collection col = new LinkedHashSet<>();
		col.add("Banana");
		col.add("Apple");
		col.add("Mango");
		col.add("Lemon");
		col.add("orange");
		col.add("Apple");
		col.add(null);
		System.out.println(col);
		
		
	}
	public static void testTreeSet()
	{
		//Internally Used BlackTree
		// LinkedHashSet Gives sorting order
		//Null not alloweed
		System.out.println("-------------------------TreeSet------------------------");
		Collection col = new TreeSet<>();
		col.add("Banana");
		col.add("Apple");
		col.add("Mango");
		col.add("Lemon");
		col.add("orange");
		col.add("Apple");
		//col.add(null);
		System.out.println(col);
			
	}
}
