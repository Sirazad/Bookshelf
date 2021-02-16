package com.codecool.sirazad.model.bookentity;


public class HardcoverBook extends Book {
    private static final int COVER_WEIGHT = 100;


    public HardcoverBook(String title, String author, int releaseYear, int numberOfPages, Genre genre) {
        super(title, author, releaseYear, numberOfPages, COVER_WEIGHT + numberOfPages * PAGE_WEIGHT, genre);

    }

}
