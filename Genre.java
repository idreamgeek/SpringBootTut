package com.example.accessingdatajpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Genre{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long GenreId;
    private String GenreName;



    protected Books() {}

    public Genre(Long GenreId, String GenreName) {
        this.GenreId = GenreId;
        this.GenreName = GenreName;


        @Override
        public String toString() {
            return String.format(
                    "Genre[GenreId=%d, GenreName='%s']",
                    GenreId, GenreName);
        }

    public Long GenreId() {
        return GenreId;
    }

    public String getGenreName() {
        return GenreName;
    }

}