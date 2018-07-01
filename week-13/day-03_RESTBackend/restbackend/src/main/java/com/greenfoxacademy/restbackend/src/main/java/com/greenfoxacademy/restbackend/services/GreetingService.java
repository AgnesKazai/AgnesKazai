package com.greenfoxacademy.restbackend.services;

import org.springframework.stereotype.Service;

@Service
public interface GreetingService {

    Object getWelcomeMessage(String name, String title);
}
