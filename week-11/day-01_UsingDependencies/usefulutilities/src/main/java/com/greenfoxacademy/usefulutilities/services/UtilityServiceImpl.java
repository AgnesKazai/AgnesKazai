package com.greenfoxacademy.usefulutilities.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class UtilityServiceImpl implements UtilityService {
    ArrayList<String> colors;
    Random random;
    private Boolean isValid;

    public UtilityServiceImpl() {
        colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("lime");
        colors.add("orange");
        colors.add("magenta");
        random = new Random();
    }

    public String randomColor() {
        return colors.get(random.nextInt(colors.size()));
    }

    public boolean validateEmail(String userInput) {
        if (userInput.contains("@") && userInput.contains(".")) {
            return true;
        } else {
            return false;
        }
    }

    public String caesarEncoder(String text, int number) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            result += (char) ((int) text.charAt(i) + number);
        }
        return result;
    }

    public String caesarDecoder(String text, int number) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            result += (char) ((int) text.charAt(i) - number);
        }
        return result;
    }
}

