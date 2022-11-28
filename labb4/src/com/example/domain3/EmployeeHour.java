package com.example.domain3;

public class EmployeeHour extends EmployeeBase {
	private double perHour;
	
	public EmployeeHour(String name, int age, double exp, double perHour) {
		this.name = name;
		this.age = age;
		this.exp = exp;
		this.perHour = perHour;
	}
	
	public String toString() {
		SredMonth();
		return "Имя сотрудника: " + name + ", возраст сотрудника: " + age + ", зарплата: " + salary;
	}
	
	@Override
	public double SredMonth() {
		salary = 20.8*8*perHour;
		return salary;
	}
}
