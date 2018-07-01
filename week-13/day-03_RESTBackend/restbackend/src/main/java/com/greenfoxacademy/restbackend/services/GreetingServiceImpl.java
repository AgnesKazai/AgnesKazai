package com.greenfoxacademy.restbackend.services;

import com.greenfoxacademy.restbackend.models.ErrorMessage;
import com.greenfoxacademy.restbackend.models.Greeter;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{

    @Override
    public Object getWelcomeMessage(String name, String title) {
        if(name == null || title == null){
            return new ErrorMessage("Please provide a name!");
        } else {
            return new Greeter(name, title);
        }
    }
}
