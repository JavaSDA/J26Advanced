package com.company.exercises.exception;

public class BookTest {
    public static void main(String[] args) {
        try {
            Library lib = new Library(5);

            lib.addBook(new Book(1, "The song of ice and fire", "Jon Snow", "2020"));
            lib.addBook(new Book(2, "Goals", "Marcus Rashford", "2022"));
            lib.addBook(new Book(2, "Robin Hood", "Stephen Curry", "2023"));

            System.out.println(lib.searchBookById(2));
        } catch (NoBookFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
