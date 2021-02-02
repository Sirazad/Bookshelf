package com.codecool.sirazad;

import java.util.StringJoiner;

public class Book {
    private String title;
    private String author;
    private int numberOfPages;
    private int releaseYear;
    private int weightInGram;
    public static final int PAGE_WEIGHT = 10;

    Book(String title, String author, int releaseYear, int numberOfPages, int weightInGram) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.releaseYear = releaseYear;
        this.weightInGram = weightInGram;
    }


    public String getBookinfo() {
        return author+": "+title+"("+releaseYear+")";
    }


    public int getReleaseYear() {
        return releaseYear;
    }


    public int getWeightInGram() {
        return weightInGram;
    }


    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getAuthor() {
        return author;
    }
    @Override
    public String toString() {
        return this.getAuthor()+": "+this.title+"("+this.releaseYear+")";
    }

}
