package com.greenfoxacademy.restbackend.models;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

@Component
public class DoUntilValue {

    private Integer until;

    public DoUntilValue() {
    }

    public DoUntilValue(Integer until) {
        this.until = until;
    }

    public Integer getUntil() {
        return until;
    }

    public void setUntil(Integer until) {
        this.until = until;
    }
}
