package com.example;
import com.example.domain.Employee;

import lab2.*;
public class EmployeeTest {
	
	    public static void main(String[] args) {
	    Employee emp = new Employee();
	    emp.setEmpId(101);
	    emp.setName("Jane Smith");
	    emp.setSalary(120345.27);
	    emp.setSsn("012-34-5678");
	    System.out.println("Employee ID: "+emp.getEmpId());
	    System.out.println("Employee Name: "+emp.getName());
	    System.out.println("Employee Soc Sec # "+emp.getSsn());
	    System.out.println("Employee salary: "+emp.getSalary());

	    
	    
	    
	    CPU ab = new CPU();
	    ab.setCore(6);
	    ab.setHrz(3200);
	    ab.setGeneration("Ryzen 5");
	    System.out.println("number of cores: "+ab.getCore());
	    System.out.println("hertz: "+ab.getHrz());
	    System.out.println("Generation: "+ab.getGeneration());
	    Hardware ab1 = new Hardware();
	    ab1.setRAMname("Kingston FURY Beast");
	    ab1.setSSDname("SSD AMD Radeon R5 ");
	    ab1.setCPUname("Ryzen 5");
	    System.out.println("RAM : "+ab1.getRAMname());
	    System.out.println("SSD: "+ab1.getSSDname());
	    System.out.println("CPU: "+ab1.getCPUname());
	    SSD ab2 = new SSD();
	    ab2.setPricessd(82.09);
	    ab2.setInterface("SATA 3.0");
	    ab2.setYearssd(2018);
	    System.out.println("Price:"+ab2.getPricessd());
	    System.out.println("Interface: "+ab2.getInterface());
	    System.out.println("date of release: "+ab2.getYearssd());
	    RAM ab3 = new RAM();
	    ab3.setMemorySupport("DDR4");
	    ab3.setVolume(16);
	    ab3.setFrequency(3200);
	    System.out.println("Memory Support: "+ab3.getMemorySupport());
	    System.out.println("Volume: "+ab3.getVolume());
	    System.out.println("Frequency: "+ab3.getFrequency());
}
}
