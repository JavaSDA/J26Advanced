package com.company.practicalEx.singleFileEx;

import java.util.Random;
import java.util.Scanner;

public class RandomPasswordGen {
    // Declare a constant for the uppercase letters
    private static final String UPPER_CASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER_CASE_CHARS = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String ALL_CHARS = UPPER_CASE_CHARS + LOWER_CASE_CHARS + DIGITS;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What's the length of password to gen?: ");
        int length = scan.nextInt();

        String password = generatePassword(length);
        System.out.println("Your gen password is: " + password);
    }


    private static String generatePassword(int length) {
        Random rand = new Random();

        StringBuilder password = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            // generate the random index within the bounds
            // of the all chars string
            int randomIndex = rand.nextInt(ALL_CHARS.length());

            // extract the character using the index you got above
            char randomChar = ALL_CHARS.charAt(randomIndex);

            // append
            password.append(randomChar);
        }
        return password.toString();
    }
}
