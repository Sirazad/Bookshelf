package com.codecool.sirazad.Dao;

import com.codecool.sirazad.model.bookentity.Author;
import com.codecool.sirazad.model.bookentity.Book;

import java.util.List;

public interface BookshelfDao {

    public void addBookToDB(Book book);
    public Book findByTitle(String title);
    public List<Book> findBooksByAuthor(Author author);
    public Book findById(Book book);
}
