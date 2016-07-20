package com.example.taku.dagger2unittestsample.entities;

/**
 * Created by taku on 2016/07/21.
 */
public class User {
    public long id;
    public String login;

    @Override
    public String toString() {
        return "User[id: " + id + ", login: " + login + "]";
    }
}
