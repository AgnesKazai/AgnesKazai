package com.greenfoxacademy.restbackend.models;

import org.springframework.stereotype.Component;

@Component
public class ArrayHandlerDouble {

    private int[] result;

    public ArrayHandlerDouble() {
    }

    public int[] getResult() {
        return result;
    }

    public void setResult(int[] result) {
        this.result = result;
    }

    public ArrayHandlerDouble(String what, int[] numbers) {
        if (what.equals("double")) {
            result = doubling(numbers);
        }
    }

    public int[] doubling(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }
        return numbers;
    }
}
