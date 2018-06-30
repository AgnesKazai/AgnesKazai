package com.greenfoxacademy.restbackend.services;

import com.greenfoxacademy.restbackend.models.Doubling;
import com.greenfoxacademy.restbackend.models.ErrorMessage;
import org.springframework.stereotype.Service;

@Service
public class DoublingServiceImpl implements DoublingService {

    @Override
    public Object getResult(Integer recieved) {
        if (recieved != null) {
            return new Doubling(recieved);
        } else {
            return new ErrorMessage("Please provide an input!");
        }
    }
}

