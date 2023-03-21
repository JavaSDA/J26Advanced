package com.company.exercises.collections;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // You can use other implementations if you prefer,
        // but we're using a treemap because this is a phone book
        Map<String, String> phoneBook = new TreeMap<>();

        while(true) {
            System.out.println("Phone Book App");
            System.out.println("Menu: \n"); // space

            System.out.println("1. Add Contact");
            System.out.println("2. Find Contact by Name");
            System.out.println("3. List Contacts");
            System.out.println("4. Exit");

            System.out.println(); // space
            System.out.print("Enter a menu option(number): ");
            int choice = scan.nextInt();

            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter contact name: ");
                    String name = scan.nextLine();

                    System.out.print("Enter contact number: ");
                    String phone = scan.nextLine();
                    phoneBook.put(name, phone);
                    System.out.println("Contact added: " + name + " (" + phone + ")\n\n");
                    break;
                case 2:
                    System.out.print("Enter contact name: ");
                    name = scan.nextLine();
                    phone = phoneBook.get(name);
                    if (phone == null) {
                        System.out.println("Contact not found: " + name + "\n\n");
                    } else {
                        System.out.println("Contact retrieved: " + name + " (" + phone + ")\n\n");
                    }
                    break;
                case 3:
                    System.out.println("Contacts: ");
                    for (String contactName : phoneBook.keySet()) {
                        phone = phoneBook.get(contactName);
                        System.out.println(contactName + " (" + phone + ")\n");
                    }
                    System.out.println(); // space
                    break;
                case 4:
                    System.out.println("Exiting....");
                    System.exit(0); // Terminate the program execution
                default:
                    System.out.println("Invalid menu option.");
            }


        }
    }
}
