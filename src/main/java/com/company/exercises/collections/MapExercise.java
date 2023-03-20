package com.company.exercises.collections;

import java.sql.SQLOutput;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExercise {
    public static void main(String[] args) {
        Map<String, String> countries = storeCountries();

        System.out.println(); // Just for space

        for (String country : countries.keySet()) {
            System.out.println("The capital of " + country + " is: " + countries.get(country));
        }
    }

    public static Map<String, String> storeCountries() {
        Scanner scan = new Scanner(System.in);
        Map<String, String> countries = new LinkedHashMap<>();

        System.out.println("Enter countries and capitals as prompted, enter 'z' to quit");
        while(true) {
            System.out.print("Enter a country: ");
            String country = scan.nextLine();

            if (country.equals("z")) {
                break;
            }

            System.out.print("Enter a capital: ");
            String capital = scan.nextLine();

            if (capital.equals("z")) break;

            countries.put(country, capital);
            System.out.println(); // Just for space
        }

        return countries;
    }

}
