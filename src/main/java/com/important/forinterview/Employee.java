package com.important.forinterview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employee {

	private int id;
	private String name;
	private int age;
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return name ;
	}
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "Raj", 22));
		list.add(new Employee(1, "Karan", 66));
		list.add(new Employee(1, "Kiran", 27));
		list.add(new Employee(1, "Kiran", 27));
		
		
		Map<Integer, List<Employee>> map = new HashMap<>();
		
		for(Employee e : list)
		{
			
			
			map.computeIfAbsent(e.getAge(), k -> new ArrayList()).add(e);
		}
		
		for(Map.Entry<Integer, List<Employee>> set : map.entrySet())
		{
			System.out.println(set.getKey()+" "+set.getValue());
		}	
	}
	
	
	
}
