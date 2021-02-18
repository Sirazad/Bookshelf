package com.codecool.sirazad;

import com.codecool.sirazad.model.Customer.Customer;
import com.codecool.sirazad.model.bookentity.Book;

import java.util.List;

public class MyMockDatabase {

    private List<Customer> customerList;
    private List<Book> BookListOnShelf;

    private void fillCustomerList() {
        customerList.add(new Customer("Anna", 01011980, "anna@gmail.com"));
    }
}
