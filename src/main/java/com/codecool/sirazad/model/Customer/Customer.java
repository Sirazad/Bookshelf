package com.codecool.sirazad.model.Customer;

import com.codecool.sirazad.model.Feedback.Opinion;
import com.codecool.sirazad.model.Feedback.Rating;
import com.codecool.sirazad.model.bookentity.Book;
import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Data
public class Customer {
    private final String NAME;
    private final Date BIRTH;
    private long customerId;
    private String email;
    private List<Book> wishList;
    private List<Rating> bookRatings;
    private List<Opinion> bookOpinions;

    public Customer(String name, Date birth, String email){
        this.NAME = name;
        this.BIRTH = birth;
        this.email = email;
    }

    public void addBookToWish(Book book) {
        wishList.add(book);
    }

    public void addRating(Rating rating) {
        bookRatings.add(rating);
    }

    public void addOpinion(Opinion opinion) {
        bookOpinions.add(opinion);
    }


    public void updateOpinion(Object setOpinon) {
        //...
    }
}
