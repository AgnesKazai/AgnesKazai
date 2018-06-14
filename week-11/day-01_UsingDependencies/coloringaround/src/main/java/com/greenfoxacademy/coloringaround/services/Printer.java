package com.greenfoxacademy.coloringaround.services;

import com.greenfoxacademy.coloringaround.services.MyColor;
import com.greenfoxacademy.coloringaround.services.MyColorImplBlue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class Printer {

    @Qualifier(value = "myColorImplBlue")
    @Autowired
    MyColor myColor;

    public Printer() {
        System.out.println("Hello from Constructor");
    }

    public void log(String message) {
        myColor.printColor();
        System.out.println(LocalDateTime.now() + " MY PRINTER SAYS --- " + message);
    }
}
