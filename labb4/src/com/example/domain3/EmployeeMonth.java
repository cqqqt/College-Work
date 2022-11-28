package com.example.domain3;

public class EmployeeMonth extends EmployeeBase {
	private double monthCash;
	
	public EmployeeMonth(String name, int age, double exp, double monthCash) {
		this.name = name;
		this.age = age;
		this.exp = exp;
		this.monthCash = monthCash;
	}

	public String toString() {
		SredMonth();
		return "Имя сотрудника: " + name + ", возраст сотрудника: " + age + ", зарплата: " + salary;
	}

	@Override
	public double SredMonth() {
		salary = monthCash;
		return salary;
	}
}
