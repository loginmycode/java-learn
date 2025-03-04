package com.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class TestMap {
	
	
	public static void main(String[] args) {
		
		// Hasmap allows one null as key multiple null as value
		// It wont give any order
		Map<String, Integer> hashmap = new HashMap<>();
		hashmap.put("Banana", 1);
		hashmap.put("Lemon", 4);
		hashmap.put("Orange", 2);
		hashmap.put("Apple", 7);
		//hashmap.put("Apple", 71);
		//hashmap.put("Banana", 15);
		hashmap.put(null, null);
		hashmap.put("Test", null);
		hashmap.put("Test1", null);
		
		
		System.out.println("HashMap Output =" +hashmap);
		
		
		
		Map<String, Integer> linkHasMap = new LinkedHashMap<>();
		linkHasMap.put("Apple", 7);
		linkHasMap.put(null, null);
		linkHasMap.put("Banana", 1);
		linkHasMap.put("Lemon", 4);
		linkHasMap.put("Orange", 2);
		linkHasMap.put("Apple", 7);
		//linkHasMap.put("Apple", 71);
		//linkHasMap.put("Banana", 15);
		linkHasMap.put(null, null);
		linkHasMap.put("Test", null);
		linkHasMap.put("Test1", null);
		//linkHasMap.put("Lemon", 100);
		
		
		System.out.println("LinkedHashMap Output =" +linkHasMap);
		
		
		
		Map<String, Integer>  treeMap = new TreeMap<>();
		treeMap.put("Banana", 1);
		treeMap.put("Lemon", 4);
		treeMap.put("Orange", 2);
		treeMap.put("Apple", 7);
		treeMap.put("Apple", 71);
		treeMap.put("Banana", 15);
		//treeMap.put(null, null);
		treeMap.put("Test", null);
		treeMap.put("Test1", null);
		//linkHasMap.put("Lemon", 100);
		
		
		
		
		System.out.println("TreeMap Output =" +treeMap);
		
		
		Map<String, Integer>  hashtable = new Hashtable<>();
		hashtable.put("Lemon", 4);
		hashtable.put("Orange", 2);
		hashtable.put("Apple", 7);
		hashtable.put("Apple", 71);
		hashtable.put("Banana", 15);
		//treeMap.put(null, null);
		//hashtable.put("Test", null);
		//hashtable.put("Test1", null);
		//linkHasMap.put("Lemon", 100);
		
		System.out.println("HashTable Output ="+hashtable);
		
		Map<String , Integer> concMap = new ConcurrentHashMap<>();
		concMap.put("Apple", 7);
		//concMap.put(null, null);
		concMap.put("Banana", 1);
		concMap.put("Lemon", 4);
		concMap.put("Orange", 2);
		concMap.put("Apple", 7);
		concMap.put("Apple", 0);
		//linkHasMap.put("Banana", 15);
		//concMap.put(null, null);
		//concMap.put("Test", null);
		//concMap.put("Test1", null);
		//linkHasMap.put("Lemon", 100);
		
		System.out.println("ConcurrentHashMap Output ="+concMap);
		
		
		
		
	}
}
