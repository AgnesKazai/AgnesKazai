package com.greenfoxacademy.restbackend.services;


import org.springframework.stereotype.Service;

@Service
public class DoUntilServiceImpl implements DoUntilService {

    private Integer result;

    @Override
    public Integer factor(Integer input) {
        Integer resultFact = 1;
        for (int i = 1; i <= input; i++) {
            resultFact *= i;
        }

        return resultFact;
    }

    @Override
    public Integer sum(Integer input) {
        Integer resultSum = 0;
        for (int i = 0; i <= input; i++) {
            resultSum += i;
        }
        return resultSum;
    }

    @Override
    public Integer checkWhatIsTheOperation(String what, Integer input) {
        if (what.equals("sum")) {
            return sum(input);
        } else {
            return factor(input);
        }
    }
}
