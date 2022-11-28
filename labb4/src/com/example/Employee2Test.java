package com.example;

import com.example.domain3.EmployeeMonth;
import com.example.domain3.EmployeeHour;

public class Employee2Test {

	public static void main(String[] args) {
		EmployeeMonth e1 = new EmployeeMonth("Pavel", 24, 1.5, 1200);
		EmployeeHour e2 = new EmployeeHour("Nikita", 23, 1, 10);
		System.out.println(e1);
		System.out.println(e2);

	}

}
