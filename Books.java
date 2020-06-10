package com.example.accessingdatajpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Books{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long BookId;
    private String BookName;
    private String BookPublisher;
    private String BookAuthor;
    private Int YearReleased;
    private Int version;

    protected Books() {}

    public Users(String firstName, String lastName) {
        this.BookId = BookId;
        this.BookName = BookName;
        this.BookPublisher = BookPublisher;
        this.BookAuthor = BookAuthor;
        this.YearReleased = YearReleased;
        this.version = version;

        @Override
        public String toString() {
            return String.format(
                    "Users[BookId=%d, BookName='%s', BookPublisher='%s', BookAuthor='%s', YearReleased='%d', version='%d' ]",
                    BookId, BookName, BookPublisher, BookAuthor, YearReleased, version);
        }

    public Long getBookId() {
        return BookId;
    }

    public String getBookName() {
        return BookName;
    }

    public String getBookPublisher() {
        return BookPublisher;
    }

    public Int getBookAuthor() {
        return BookAuthor;
    }
    public Int getYearReleased() {
        return YearReleased;
    }

    public Int getVersion() {
        return version;
    }
}