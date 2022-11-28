package com.company;
import java.text.NumberFormat;
import java.util.Locale;

public class z2Report
{
    public static void generateReport(z2Employee[] employees)
    {
        Locale locale = new Locale("en","En");
        NumberFormat numberFormat1 = NumberFormat.getInstance(locale);
        for (z2Employee emp : employees)
            System.out.printf(String.format("Полное имя: %s Зарплата: %s\n", emp.getFullName(), numberFormat1.format(emp.getSalary())));
    }
}
