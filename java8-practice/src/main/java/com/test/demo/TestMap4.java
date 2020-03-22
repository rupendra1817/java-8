package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestMap4 {

	public static void main(String[] args) {
		List<Employee> employeeList = Arrays.asList(
				new Employee(1L, "deepak", "manage",
						55000.00d),
				new Employee(1L, "rahul", "CA", 95000.00d),
				new Employee(1L, "raj", "developer",
						45000.00d));

		List<String> employeeNames = employeeList.stream()
				.map(x -> x.getName())
				.collect(Collectors.toList());

		System.out.println(employeeNames);

	}
}
