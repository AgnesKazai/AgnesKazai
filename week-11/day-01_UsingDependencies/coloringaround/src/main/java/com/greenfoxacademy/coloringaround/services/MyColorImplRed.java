package com.greenfoxacademy.coloringaround.services;

import org.springframework.stereotype.Service;

@Service
public class MyColorImplRed implements MyColor {

    @Override
    public void printColor() {
        System.out.println("It is red in color...");
    }
}
