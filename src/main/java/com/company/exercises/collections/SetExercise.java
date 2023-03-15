package com.company.exercises.collections;

import java.util.*;

public class SetExercise {
    public static void main(String[] args) {
        // Initialize the scanner
        Scanner scanner = new Scanner(System.in);

        // Initialize the Tree Set
        Set<Integer> nums = new TreeSet<>();

/*        // Accept input from the user
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter a number: "); // Prompt the user
            nums.add(scanner.nextInt());
        }*/

        // output the numbers
//        System.out.println(nums);


/*        // Create hashset
        Set<String> words = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter a string: "); // Prompt the user
            if (!words.add(scanner.next())) {
                System.out.println("Duplicate encountered");
            }
        }

        System.out.println(words);*/


        // Create LinkedHashSet
        Set<String> names = new LinkedHashSet<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter a string: "); // Prompt the user
            names.add(scanner.next());

        }

        System.out.println(names);

    }
}
