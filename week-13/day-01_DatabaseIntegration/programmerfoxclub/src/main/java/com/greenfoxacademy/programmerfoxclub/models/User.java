package com.greenfoxacademy.programmerfoxclub.models;

import org.springframework.stereotype.Component;

@Component
public class User {

    private String username;
    private String password;
    private Fox fox;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.fox = new Fox("GreenFox");
    }

    public Fox getFox() {
        return fox;
    }

    public void setFox(Fox fox) {
        this.fox = fox;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
