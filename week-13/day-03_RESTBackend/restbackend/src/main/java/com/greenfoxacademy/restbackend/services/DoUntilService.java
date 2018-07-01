package com.greenfoxacademy.restbackend.services;


import org.springframework.stereotype.Service;

@Service
public interface DoUntilService {

    Integer factor(Integer input);

    Integer sum(Integer input);

    Integer checkWhatIsTheOperation(String what, Integer input);

}
