package com.example.accessingdatajpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Authors{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String FirstName;
    private String LastName;



    protected Authors() {}

    public Genre(String FirstName, String LastName) {
        this.FirstName = FirstName;
        this.LastName = LastName;


        @Override
        public String toString() {
            return String.format(
                    "Authors[FirstName=%d, LastName='%s']",
                    FirstName, LastName);
        }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

}