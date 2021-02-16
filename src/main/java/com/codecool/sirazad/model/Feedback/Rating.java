package com.codecool.sirazad.model.Feedback;

public class Rating {
    private long id;
    private int rating;
    private long bookId;
    private long customerId;

    public Rating(long id, long bookId, long customerId, int rating ) {
        this.id = id;
        this.bookId = bookId;
        this.customerId = customerId;
        this.rating = rating;
    }

    public Rating(long id, long bookId, long customerId) {
        this.id = id;
        this.bookId = bookId;
        this.customerId = customerId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

}
