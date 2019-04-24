package com.Vladimir.lesson_10.Homework.learn_maps;

public class User {
    private String login, password;

    public String getPassword(){
        return password;
    }

    User(String login, String password) {
        this.login = login;
        this.password = password;
    }
}
