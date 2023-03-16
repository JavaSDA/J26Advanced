package com.company.exercises.recap.person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Company {
    private String companyName;
    private List<Employee> employees;

    public Company(String companyName) {
        this.companyName = companyName;
        this.employees = new ArrayList<>();
    }

    public Company(String companyName, List<Employee> employees) {
        this.companyName = companyName;
        this.employees = employees;
    }

    public boolean addEmployee(Employee... employees) { // Employee[] employees
        return this.employees.addAll(Arrays.asList(employees));
//        for (Employee employee : employees) {
//            this.employees.add(employee);
//        }
    }

    public float getAverageSalary() {
        // initialize a variable for the sum
        float sum = 0;

        // Loop through and sum the salaries
        for(Employee employee : employees) {
            sum += employee.getSalary();
        }
        // return the average
        return sum / employees.size(); // average value
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", employees=" + employees +
                '}';
    }
}
