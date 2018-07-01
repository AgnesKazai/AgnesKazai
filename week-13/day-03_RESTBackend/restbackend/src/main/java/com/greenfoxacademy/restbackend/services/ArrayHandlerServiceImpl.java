package com.greenfoxacademy.restbackend.services;

public class ArrayHandlerServiceImpl {
    String what;

    public int sum(String what, int numbers[]) {
        int resultSum = 0;
        if (what.equals("sum")) {
            for (int i = 0; i < numbers.length; i++) {
                resultSum += i;
            }
            return resultSum;
        } else if (what.equals("multiply")) {
            for (int i = 0; i < numbers.length; i++) {
                resultSum *= i;
            }
            return resultSum;
        }
    }
}