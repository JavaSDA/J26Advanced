package com.company.exercises.person;

public class Employee extends Person {
    private String occupation;
    private String employeeId;

    public Employee(Person person, String occupation, String employeeId) {
        super(person);
        this.occupation = occupation;
        this.employeeId = employeeId;
    }

    public Employee(String firstName, String lastName, int age, String occupation, String employeeId) {
        super(firstName, lastName, age);
        this.occupation = occupation;
        this.employeeId = employeeId;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getEmployeeId() {
        return employeeId;
    }
}
