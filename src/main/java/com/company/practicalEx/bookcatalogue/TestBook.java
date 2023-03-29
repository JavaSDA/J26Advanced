package com.company.practicalEx.bookcatalogue;

public class TestBook {
    public static void main(String[] args) {
        String gameOfThrones = "Song of Ice and Fire";
        String author = "George Martin";

        String goals = "Goals";
        String goalsAuthor = "Brian Tracy";

        Book game = new Book(gameOfThrones,author, 100);
        Book goal = new Book(goals, goalsAuthor, 200);

        BookCatalogue theBookBrochure = new BookCatalogue();

        theBookBrochure.addBooks(game, goal);
//        theBookBrochure.removeBook();
        System.out.println(theBookBrochure.searchBooksByTitle(gameOfThrones));
        System.out.println(theBookBrochure.getTotalPrice());
    }
}
