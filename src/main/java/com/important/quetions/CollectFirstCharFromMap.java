package com.important.quetions;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

public class CollectFirstCharFromMap {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1,"Apple");
		map.put(1,"Orange");
		map.put(1,"Lemon");
		map.put(1,"Pinapple");
		
		List<Character> list =map.values().stream().map(c->c.charAt(0)).collect(Collectors.toList());
		
		System.out.println(list);
		
	}
}

