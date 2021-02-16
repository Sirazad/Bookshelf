package com.codecool.sirazad;

import com.codecool.sirazad.model.bookentity.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bookshelf {
    List<Book> storedBooks = new ArrayList<>();
    private static int piecesAvailable = 0;



    public void addBook(Book newBook) {
        storedBooks.add(newBook);
    }

    public List<Book> getBooks(int year) {
        return storedBooks.stream().filter(n-> n.getReleaseYear() == year).collect(Collectors.toList());
    }

    public Book getLightestAuthor() {
        return storedBooks.stream().reduce((book1, book2)
                 -> book1.getWeightInGram() > book2.getWeightInGram()
                ? book1 : book2).stream().findAny().get();
    }


    public String getAuthorOfMostWrittenPages() {
        return storedBooks.stream()
                .reduce((book1, book2)
                -> book1.getNumberOfPages() > book2.getNumberOfPages()
                ? book1: book2)
                .stream()
                .findAny().get()
                .getAuthor();
    }

}