package com.codecool.sirazad.model.bookentity;

import lombok.Data;
import lombok.Getter;

import java.util.StringJoiner;
@Data
public class Book {
    public long bookId;
    private String title;
    private String author;
    private int numberOfPages;
    private int releaseYear;
    private int weightInGram;
    public static final int PAGE_WEIGHT = 10;
    public Genre genre;
    //TODO refactor
    private int piecesAvailable = 0;


    public Book(String title, String author, int releaseYear, int numberOfPages, int weightInGram, Genre genre) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.releaseYear = releaseYear;
        this.weightInGram = weightInGram;
        this.genre = genre;

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
