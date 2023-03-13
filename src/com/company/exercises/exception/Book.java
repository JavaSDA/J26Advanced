package com.company.exercises.exception;

// import java.util.Date;

public class Book {

    private int id;
    private String title;
    private String author;
    private String yearOfRelease;

    public Book(int id, String title, String author, String yearOfRelease) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.yearOfRelease = yearOfRelease;
    }

    public int getId() {
        return id;
    }

    // Annotation
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfRelease='" + yearOfRelease + '\'' +
                '}';
    }
}
