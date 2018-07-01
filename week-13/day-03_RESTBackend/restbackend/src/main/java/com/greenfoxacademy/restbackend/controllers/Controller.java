package com.greenfoxacademy.restbackend.controllers;


import com.greenfoxacademy.restbackend.services.AppendAServiceImpl;
import com.greenfoxacademy.restbackend.services.DoublingServiceImpl;
import com.greenfoxacademy.restbackend.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private DoublingServiceImpl doublingService;
    private GreetingServiceImpl greetingService;
    private AppendAServiceImpl appendAService;

    @Autowired
    public Controller(DoublingServiceImpl doublingService, GreetingServiceImpl greetingService, AppendAServiceImpl appendAService) {
        this.doublingService = doublingService;
        this.greetingService = greetingService;
        this.appendAService = appendAService;
    }

    @GetMapping("/doubling")
    public Object getDoubleValue(@RequestParam(value = "input", required = false) Integer recieved) {
        return doublingService.getResult(recieved);
    }

    @GetMapping("/greeter")
    public Object getGreeting(@RequestParam(value = "name", required = false) String name,
                              @RequestParam(value = "title", required = false) String title) {
        return greetingService.getWelcomeMessage(name, title);
    }

    @GetMapping("/appenda/{appendable}")
    public Object getGreeting(@PathVariable(value = "appendable") String appendable) {
        return appendAService.getAppendA(appendable);
    }
}
