package com.greenfoxacademy.restbackend.models;

import org.springframework.stereotype.Component;

@Component
public class Sith {

    private String text;

    public Sith() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
