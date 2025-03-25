package com.important.quetions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;




public class EmployeeWithStreamOperation {

	public static void main(String[] args) {
		
		//highestAndLowest();
		listTheEmpBasedOnDetails();
	}
	
	public static void highestAndLowest()
	{
		List<Employee> list = new ArrayList();
		list.add(new Employee(1,"Rama",20,"Mechanical", 6500));
		list.add(new Employee(2,"Karan",24,"Mechanical", 50000));
		list.add(new Employee(3,"Suman",45,"Electrical",  50000));
		list.add(new Employee(4,"Kumar",30,"Software", 60000));
		list.add(new Employee(4,"Deepti",28,"Software", 90000));
		
		System.out.println("---------------------High and Low salary------------------------");
		Optional<Integer> maxSalary =list.stream().map(Employee::getSalary).max(Integer::compareTo);
		System.out.println("Highest Salary = " +maxSalary.get());
		
		Optional<Integer> minimumSalary =list.stream().map(Employee::getSalary).min(Integer::compareTo);
		System.out.println("Lowest Salary = "+ minimumSalary.get());
		System.out.println("---------------------High and Low Age------------------------");
		
		Optional<Integer> OldAge = list.stream().map(Employee::getAge).max(Integer::compareTo);
		System.out.println("Oldest = "+OldAge);
		Optional<Integer> minAge = list.stream().map(Employee::getAge).min(Integer::compareTo);
		System.out.println("Youngest = "+minAge.get());
				
		System.out.println("---------------------Sum of total salary------------------------");
		Double totalSalary =list.stream().mapToDouble(Employee::getSalary).sum();
		System.out.println("Total Salary = "+totalSalary);
		OptionalDouble minSalary =list.stream().mapToDouble(Employee::getSalary).min();
		System.out.println(minSalary);
		
		System.out.println("---------------------Number of Employees------------------------");
		Long  totalEmployee =list.stream().collect(Collectors.counting());
		System.out.println(totalEmployee);
		long totalEmployee1 =list.stream().count();
		System.out.println(totalEmployee1);
		list.stream().map(Employee::getSalary).distinct().forEach(System.out::println);;
		
		System.out.println("---------------------Find second Highest salary------------------------");
		
		//Remove duplicate
		//Descending Order
		//skip First value
		
	    Optional<Integer> secondHighestSalary =	list.stream().map(Employee::getSalary).distinct()
	    										.sorted(Comparator.reverseOrder()).skip(1).findFirst();
	    System.out.println("Second High salary = "+ secondHighestSalary.get());
	    Optional<Integer> lowestSalry = list.stream().map(Employee::getSalary).distinct().sorted().findFirst();
	    System.out.println("Lowest Salry = "+lowestSalry.get());
	    Optional<Integer> secondLowestSalry = list.stream().map(Employee::getSalary).distinct().sorted().skip(1).findFirst();
	    System.out.println("Second Lowest Salary = "+secondLowestSalry.get());	
	}
	public static void listTheEmpBasedOnDetails()
	{
		List<Employee> list = new ArrayList();
		list.add(new Employee(1,"Rama",20,"Mechanical", 6500));
		list.add(new Employee(2,"Karan",24,"Mechanical", 50000));
		list.add(new Employee(3,"Suman",45,"Electrical",  50000));
		list.add(new Employee(4,"Kumar",30,"Software", 60000));
		list.add(new Employee(4,"Deepti",28,"Software", 90000));
		
		
		System.out.println("---------------------List Based on Department------------------------");
		Map<String, List<String>> departments =	list.stream().collect(Collectors.groupingBy(emp -> emp.getDepartment(), Collectors.mapping(emp-> emp.getName(),Collectors.toList())));
		System.out.println("Department with Employyes = "+departments);
		Map<String, List<String>> names = list.stream().collect(Collectors.groupingBy(name ->name.getName(), Collectors.mapping(emp -> emp.getDepartment(), Collectors.toList())));
		System.out.println(names);
		
	}
}