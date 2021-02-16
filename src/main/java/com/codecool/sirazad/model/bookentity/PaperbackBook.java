package com.codecool.sirazad.model.bookentity;

public class PaperbackBook extends Book {

    private static final int COVER_WEIGHT = 20;

    public PaperbackBook(String title, String author, int releaseYear, int numberOfPages, Genre genre) {
        super(title, author, releaseYear, numberOfPages, COVER_WEIGHT+numberOfPages*PAGE_WEIGHT, genre);
    }


}
