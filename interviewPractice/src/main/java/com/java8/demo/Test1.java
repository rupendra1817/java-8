package com.java8.demo;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Test1 {

	public static void main(String[] args) {

		/*Comparator<Employee> byName = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};*/
		
		Comparator<Employee> byName =
				(Employee o1, Employee o2)->o1.getName().compareTo(o2.getName());
				
		Comparator<Employee> b=(Employee o1, Employee o2) ->o1.getName().compareTo(o2.getName());

		Employee e1 = new Employee(100, "bhawna", 56.50F);
		Employee e2 = new Employee(200, "rahul", 58.50F);
		Employee e3 = new Employee(300, "amit", 59.50F);
		Employee e4 = new Employee(400, "chandan", 67.50F);

		Set<Employee> employees = new TreeSet<Employee>(byName);
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);

		for (Employee employee : employees) {
			System.out.println(employee.getEmpId() + "\t" + employee.getName() + "\t" + employee.getSalary());
		}
	}
}
