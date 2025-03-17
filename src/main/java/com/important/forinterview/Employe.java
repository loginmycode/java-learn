package com.important.forinterview;
import java.util.*;


class Employe {
    private int id;
    private String name;
    private String email;
    private double salary;

    public Employe(int id, String name, String email, double salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employe{id=" + id + ", name='" + name + "', email='" + email + "', salary=" + salary + "}";
    }



    public static void main(String[] args) {
        List<Employe> employees = Arrays.asList(
            new Employe(1, "Raj", "raj@gmail.com", 500003),
            new Employe(2, "Amit", "amit@gmail.com", 7000),
            new Employe(3, "John", "john@gmail.com", 9000),
            new Employe(4, "Sam", "sam@gmail.com", 6000)
        );

        // Finding employee with the highest salary
        
      Optional<Employe> list =  employees.stream().max(Comparator.comparingDouble(Employe::getSalary));
      

        // Print the highest-paid employee
        list.ifPresent(emp -> System.out.println("Highest Paid Employee: " + emp));
        
        employees.stream().sorted().skip(2).limit(1);
    }
}
