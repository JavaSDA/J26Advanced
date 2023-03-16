package com.company.exercises.recap.person;

public class Employee extends Person {
    private String occupation;
    private float salary;
    private int employeeId;

    public Employee(Person person, String occupation, float salary, int employeeId) {
        super(person);
        this.occupation = occupation;
        this.salary = salary;
        this.employeeId = employeeId;
    }

    public Employee(String firstName, String lastName, int age, String occupation, float salary, int employeeId) {
        super(firstName, lastName, age);
        this.occupation = occupation;
        this.salary = salary;
        this.employeeId = employeeId;
    }

    public float getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + this.getFirstName() + ", " +
                "occupation='" + occupation + '\'' +
                ", salary=" + salary +
                ", employeeId=" + employeeId +
                '}';
    }
}
