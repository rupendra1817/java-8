package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestMap3 {

	public static void main(String[] args) {
		List<Employee> employeeList = Arrays.asList(
				 new Employee(1L, "Deepak", "Manage", 55000.00d),
			        new Employee(2L, "Rahul", "CA", 95000.00d),
			        new Employee(3L, "Raj", "Developer", 45000.00d));
		
		List<Trainee> trainees = employeeList.stream()
				.map(x -> {
					Trainee trainee=new Trainee();
					trainee.setId(x.getId());
					trainee.setName(x.getName());
					return trainee;
				}).collect(Collectors.toList());

		System.out.println(trainees);

	}
}
