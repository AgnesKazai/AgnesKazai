package com.greenfoxacademy.restbackend.controllers;


import com.greenfoxacademy.restbackend.services.DoublingServiceImpl;
import com.greenfoxacademy.restbackend.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private DoublingServiceImpl doublingService;
    private GreetingServiceImpl greetingService;

    @Autowired
    public Controller(DoublingServiceImpl doublingService, GreetingServiceImpl greetingService) {
        this.doublingService = doublingService;
        this.greetingService = greetingService;
    }

    @GetMapping("/doubling")
    public Object getDoubleValue(@RequestParam(value = "input", required = false) Integer recieved) {
        return doublingService.getResult(recieved);
    }

}
