package com.codecool.sirazad.model.bookentity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Author {
    private final String NAME;
    private final Date BIRTH;
    private List<Book> bibliography = new ArrayList();

    public Author(String name, Date birth, List<Book> bibliography) {
        this.NAME = name;
        this.BIRTH = birth;
        this.bibliography = bibliography;
    }

    public Author(String name, Date birth) {
        this.NAME = name;
        this.BIRTH = birth;
    }

    public String getName() {
        return NAME;
    }

    public Date getBIRTH() {
        return BIRTH;
    }

    public List<Book> getBibliography() {
        return bibliography;
    }

    public void addBookToBibliography(Book book) {
        bibliography.add(book);
    }

    public void setBibliography(List<Book> bibliography) {
        this.bibliography = bibliography;
    }
}
