package com.greenfoxacademy.restbackend.models;

import org.springframework.stereotype.Component;

@Component
public class DoUntilValue {

    private int until;

    public DoUntilValue() {
    }

    public DoUntilValue(int until) {
        this.until = until;
    }

    public int getUntil() {
        return until;
    }

    public void setUntil(int until) {
        this.until = until;
    }
}

