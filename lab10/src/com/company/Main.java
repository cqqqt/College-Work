package com.company;

import java.util.ResourceBundle;
import java.util.Locale;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Task 1");
        ResourceBundle bundleDefault = ResourceBundle.getBundle("resurses");
        ResourceBundle bundle_en = ResourceBundle.getBundle("resurses", new Locale("en","US"));
        for (var x : bundleDefault.keySet())
        {
            System.out.println(bundleDefault.getString(x));
        }
        System.out.println("\nTask 2");
        z2Employee[] emp1 = new z2Employee[] { new z2Employee("fullname1", 557.10), new z2Employee("fullname2", 725.20), new z2Employee("fullname3", 345.56)}; // Заполнил
        z2Report.generateReport(emp1);
    }
}
