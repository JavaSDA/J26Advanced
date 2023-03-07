package com.company.exercises.person;

public class Person {

    // Define properties or field
    private String firstName;
    private String lastName;
    private int age;

    public Person(Person person) {
        this.firstName = person.getFirstName();
        this.lastName = person.getLastName();
        this.age = person.age;
    }

    // Define constructor
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Define getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getAge() {
        return age;
    }
}
