package com.example.accessingdatajpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Checkouts{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long UserId;
    private Long BookId;
    private int TimeStamp;



    protected Authors() {}

    public Genre(Long UserId, Loong BookId, int TimeStamp) {
        this.UserId = UserId;
        this.BookId = BookId;
        this.TimeStamp = TimeStamp;


        @Override
        public String toString() {
            return String.format(
                    "Checkouts[UserId=%d, BookId='%d', TimeStamp='%d']",
                    FirstName, LastName);
        }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

}