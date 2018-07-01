package com.greenfoxacademy.restbackend.models;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.stream.IntStream;

@Component
public class ArrayHandlerSumAndMultiply {

    private int result;

    public ArrayHandlerSumAndMultiply() {

    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public ArrayHandlerSumAndMultiply(String what, int[] numbers) {
        if (what.equals("sum")) {
            result = sum(numbers);
        } else {
            result = multiply(numbers);
        }
    }

    public int sum(int[] numbers) {
        return IntStream.of(numbers).sum();
    }

    public int multiply(int[] numbers) {
        return Arrays.stream(numbers).reduce(1, (a, b) -> (a * b));
    }
}
