package com.company.practicalEx.longestword;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestWord {

    public static void main(String[] args) {
        List<String> words = readWords();

        String longest = findLongest(words, word -> word.length()); // String::length

        System.out.println("The longest word you entered is: " + longest);

    }

    private static List<String> readWords() {
        // Initialize the scanner
        Scanner sc = new Scanner(System.in);

        // Initialize a result list
        List<String> words = new ArrayList<>();

        // Prompt the user on how to use app.
        System.out.println("Enter some words (one per line, enter an empty line to stop): ");

        // Infinite loop
        while(true) {
            String line = sc.nextLine();
            if (line.isEmpty()) {
                break;
            }
            words.add(line);
        }

        sc.close();
        return words;
    }

    // Generic find longest method
    private static <T> T findLongest(List<T> list, LengthFunction<T> function) {
        // The T represents the type you are expecting

        // The placeholder for the (potential) longest value
        T longest = null;

        // The placeholder for (potential) length of the above
        int maxLength = 0;

        // foreach loop to find the longest value
        for (T element : list) {
            int length = function.getLength(element);
            if (length > maxLength) {
                longest = element;
                maxLength = length;
            }
        }

        // return the longest value
        return longest;
    }
}
