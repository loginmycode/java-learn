package com.collection.comparble;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

import javax.script.Compilable;

public class CollectionFunctions {


	public static void checkListFunction()
	{
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(6);
		list.add(9);
		list.add(0);
		list.add(1);
		Collections.sort(list);
		System.out.println(list);
		
		List<String> stringList = new ArrayList<String>();
		stringList.add("Hello");
		stringList.add("Check");
		stringList.add("Banana");
		stringList.add("Leaf");
		stringList.add("Sachin");
		stringList.add("Good");
		Collections.sort(stringList);
		System.out.println(stringList);
		
		Collection<String> hasSet = new HashSet();
		hasSet.add("Hello");
		hasSet.add("Check");
		hasSet.add("Banana");
		hasSet.add("Leaf");
		hasSet.add("Sachin");
		hasSet.add("Good");
		hasSet.add("Good");
		hasSet.add("Good");//set doesnot allow duplicates
		//Collections.sort(hasSet);//The method sort(List<T>) in the type Collections is not applicable for the arguments (Collection<String>)
		System.out.println(hasSet);
		
		
		Collection<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("Hello");
		linkedHashSet.add("Check");
		linkedHashSet.add("Banana");
		linkedHashSet.add("Leaf");
		linkedHashSet.add("Sachin");
		linkedHashSet.add("Good");
		linkedHashSet.add("Good");
		linkedHashSet.add("Good");
		//Collections.sort(hasSet);
		System.out.println(linkedHashSet);//It gives insertion Order
		
		
		Collection<String> teeSet = new TreeSet<String>();
		teeSet.add("Hello");
		teeSet.add("Check");
		teeSet.add("Banana");
		teeSet.add("Leaf");
		teeSet.add("Sachin");
		teeSet.add("Good");
		teeSet.add("Good");
		teeSet.add("Good");
		//Collections.sort(hasSet);
		System.out.println(teeSet);//It gives sorting Order
		
	
	}
	
	public static void main(String[] args) {
		CollectionFunctions.checkListFunction();
		
	}

	
	
}
