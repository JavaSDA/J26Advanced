package com.company.exercises.exception;

import com.company.annotation.ComponentInfo;

// import java.util.Date;
@ComponentInfo(name = "Book", date = "12-04-2020", version = 2)
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

    @Override// Annotation
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfRelease='" + yearOfRelease + '\'' +
                '}';
    }
}
