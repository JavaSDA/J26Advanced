package com.company.exercises.exception;

public class Library {
    private Book[] books;
    private int size;

    public Library(int capacity) {
        books = new Book[capacity];
        size = 0;
    }

    public void addBook(Book book) {
        if (size == books.length) {
            throw new IllegalStateException("Library is full");
        }

        books[size] = book;
        size++;
    }

    public Book searchBookById(int id) {
        for (int i = 0; i < size; i++) {
            if (books[i].getId() == id) return books[i];
        }
        throw new NoBookFoundException("No book with ID (" + id + ") found.");
    }
}
