package com.company;

public class z2Employee
{
    private String fullName;
    private double salary;

    public z2Employee() {}
    public z2Employee(String fullName, double salary)
    {
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getFullName()
    {
        return fullName;
    }

    public void setFullName(String fullName)
    {
        this.fullName = fullName;
    }

    public double getSalary()
    {
        return this.salary;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }
}
