package com.greenfoxacademy.usefulutilities.services;

public interface UtilityService {

    String randomColor();

    boolean validateEmail(String userInput);

    String caesarEncoder(String text, int number);

    String caesarDecoder(String text, int number);
}

