package com.collection.comparble;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployee {

	public static void main(String[] args) {
		
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(3,"Rama","rama@gmail.com"));
		emp.add(new Employee(1,"Karana","karan@gmail.com"));
		emp.add( new Employee(5,"Mamatha","mamatha@gmail.com"));
		emp.add( new Employee(9,"Sudhir","sudhir@gmail.com"));
		emp.add( new Employee(2,"Anu","adani@gmail.com"));
		System.out.println(emp);
		
		//Collections.sort(emp);
		//System.out.println(emp);
		Collections.sort(emp, new EmpNameComprator());
		System.out.println(emp);
		
	}
}
