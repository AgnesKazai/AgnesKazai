package com.greenfoxacademy.coloringaround.services;

import org.springframework.stereotype.Service;

@Service
public class MyColorImplGreen implements MyColor {

    @Override
    public void printColor() {
        System.out.println("It is green in color...");
    }
}
