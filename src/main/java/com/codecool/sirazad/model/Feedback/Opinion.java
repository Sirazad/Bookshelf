package com.codecool.sirazad.model.Feedback;

public class Opinion {
    private long id;
    private long bookId;
    private long userId;
    private String opinion;



    public Opinion(long id, long bookId, long userId) {
        this.id = id;
        this.bookId = bookId;
        this.userId = userId;
    }

    public Opinion(long id, long bookId, long userId, String opinion) {
        this.id = id;
        this.bookId = bookId;
        this.userId = userId;
        this.opinion = opinion;
    }


    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

}
