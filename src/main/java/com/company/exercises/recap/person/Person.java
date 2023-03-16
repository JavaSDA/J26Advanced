package com.company.exercises.recap.person;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    Person(Person person) {
        this.firstName = person.firstName;
        this.lastName = person.lastName;
        this.age = person.age;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
