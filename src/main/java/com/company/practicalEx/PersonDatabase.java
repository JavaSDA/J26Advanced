package com.company.practicalEx;

import java.util.Map;
import java.util.TreeMap;

public class PersonDatabase {
    private Map<String, Person> people;

    public PersonDatabase() {
        this.people = new TreeMap<>();
    }

    public void addPerson(Person person) {
        people.put(person.getFullName(), person);
    }

    public Person getPerson(String name) {
        return people.get(name);
    }

    public void removePerson(String name) {
        people.remove(name);
    }
}
