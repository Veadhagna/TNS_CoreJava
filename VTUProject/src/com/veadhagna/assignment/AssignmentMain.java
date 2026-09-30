package com.veadhagna.assignment;

import com.veadhagna.assignment.employees.Developer;
import com.veadhagna.assignment.employees.Manager;
import com.veadhagna.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {

	public static void main(String[] args) {
		Manager m1=new Manager();
		Developer d=new Developer();
        EmployeeUtilities eu=new EmployeeUtilities(d, m1);
        eu.setSalary(50000.0f);
        System.out.println(d.getEsalary());
        System.out.println(m1.getEsalary());
	}

}
