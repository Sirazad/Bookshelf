package com.codecool.sirazad;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Bookshelf {
    List<Book> storedBooks = new ArrayList<>();


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


    private String getAuthorOfMostWrittenPages() {
        return "";
    }

}