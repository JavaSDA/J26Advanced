package com.company.practicalEx.bookcatalogue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BookCatalogue {
    private List<Book> books;

    public BookCatalogue() {
        books = new ArrayList<>();
    }

    public void addBooks(Book... books) {
        this.books.addAll(Arrays.asList(books));
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> searchBooksByAuthor(String author) {
        return books
                .stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    public List<Book> searchBooksByTitle(String title) {
        return books
                .stream()
                .filter(book -> book.getTitle().equals(title))
                .collect(Collectors.toList());
    }

    public double getTotalPrice() {
        return books
                .stream()
                .mapToDouble(Book::getPrice)
                .sum();
    }
}
