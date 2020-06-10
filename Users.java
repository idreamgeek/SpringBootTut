package com.example.accessingdatajpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long UserId;
    private String firstName;
    private String lastName;

    protected Users() {}

    public Users(String firstName, String lastName) {
        this.UserId = UserId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Users[UserId=%d, firstName='%s', lastName='%s']",
                UserId, firstName, lastName);
    }

    public Long getUserId() {
        return UserId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
