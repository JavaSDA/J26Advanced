package com.company.practicalEx.persondatabase;

@FunctionalInterface
public interface AgeFilter {
    boolean filter(Person person);
}
