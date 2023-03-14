package com.company.exercises.person;

public class PersonTest {
    public static void main(String[] args) {
        Person david = new Person("David", "Frank", 12);

        Employee david001 = new Employee(david.getFirstName(), david.getLastName(), david.getAge(), "Fisherman", "eefw22");

        Employee david002 = new Employee(david, "Businessman", "224rf3");

        System.out.println("David 001: " + david001.getFirstName());
        System.out.println("David 002: " + david002.getFirstName());

        System.out.println("David 001 employee number: " + david001.getEmployeeId());
        System.out.println("David 002 employee number: " + david002.getEmployeeId());
        System.out.println(david.getFirstName());
    }
}
