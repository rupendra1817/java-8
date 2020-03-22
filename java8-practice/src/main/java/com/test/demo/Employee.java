package com.demo;

public class Employee {
	private Long id;
	private String name;
	private String job;
	private double salary;

	public Employee(Long id, String name, String job,
			double salary) {
		super();
		this.id = id;
		this.name = name;
		this.job = job;
		this.salary = salary;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
