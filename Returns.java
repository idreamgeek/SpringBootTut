package com.example.accessingdatajpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Returns{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long BookId;
    private String BookName;
    private int TimeStamp;



    protected Returns() {}

    public Returns(Long BookId, String BookName, int TimeStamp) {
        this.BookId = BookId;
        this.BookName = BookName;
        this.TimeStamp = TimeStamp;


        @Override
        public String toString() {
            return String.format(
                    "Returns[BookId=%d, BookName='%s', TimeStamp='%d']",
                    BookId, BookName, TimeStamp);
        }

    public Long BookId() {
        return BookId;
    }

    public String BookName() {
        return BookName;
    }

    public int TimeStamp() {
        return TimeStamp;
    }
}