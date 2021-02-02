package com.codecool.sirazad;

public class PaperbackBook extends Book {

    private static final int COVER_WEIGHT = 20;

    public PaperbackBook(String title, String author, int releaseYear, int numberOfPages) {
        super(title, author, releaseYear, numberOfPages, COVER_WEIGHT+numberOfPages*PAGE_WEIGHT);
    }


}
