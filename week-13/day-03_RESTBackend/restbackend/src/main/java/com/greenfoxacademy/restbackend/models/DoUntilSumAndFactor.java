package com.greenfoxacademy.restbackend.models;

import org.springframework.stereotype.Component;

@Component
public class DoUntilSumAndFactor {

    private int result;

    public DoUntilSumAndFactor() {
    }

    public DoUntilSumAndFactor(String what, int until) {
        if (what.equals("sum")) {
            result = sum(until);
        } else {
            result = factor(until);
        }
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int sum(int until) {
        int resultSum = 0;
        for (int i = 0; i <= until; i++) {
            resultSum += i;
        }
        return resultSum;
    }

    public int factor(int until) {
        int resultFact = 1;
        for (int i = 1; i <= until; i++) {
            resultFact *= i;
        }
        return resultFact;
    }
}
