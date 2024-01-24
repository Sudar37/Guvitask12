package com.example.hrtest;

import com.example.hr.Employee;

public class EmployeeTest {
public static void main(String[] args) {
        Employee employee = new Employee("John Daniel", 53201, 85000.0);
        employee.printName();
        employee.printID();
        employee.printSalary();
    }
}
---------------------------------------------------------------------------------------------------
OUTPUT:
    
Employee name: John Daniel
Employee ID: 53201
Employee salary: 85000.0
