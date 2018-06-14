package com.greenfoxacademy.coloringaround.services;

import org.springframework.stereotype.Service;

@Service
public class MyColorImplBlue implements MyColor {

    @Override
    public void printColor() {
        System.out.println("It is blue in color...");
    }
}
