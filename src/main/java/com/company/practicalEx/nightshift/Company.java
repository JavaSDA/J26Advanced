package com.company.practicalEx.nightshift;

import java.util.*;

public class Company {
    private List<Employee> employees;

    public Company() {
        this.employees = new ArrayList<>();
    }

    public void addEmployees(Employee... employees) {
        this.employees.addAll(Arrays.asList(employees));
    }

    public double getAverageSalary() {
        // initialize a sum variable to 0
        double sum = 0;

        // loop through components and accumulate the sum
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }

        // return the sum / num of entities
        return sum / employees.size();
    }

    public Employee getOldestEmployee() {
        // Initialize the first employee as the oldest
        Employee oldest = employees.get(0);

        // compare the other employees to find out the real oldest
        // and store the value in the variable above
        for (Employee employee : employees) {
            if (employee.getAge() > oldest.getAge()) oldest = employee;
        }

        // return the oldest after the iteration is done
        return oldest;
    }

    public Employee getRandomEmployee() {
        Random random = new Random();
        int index = random.nextInt(employees.size());
        return employees.get(index);
    }

}
