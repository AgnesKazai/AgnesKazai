package com.greenfoxacademy.restbackend.controllers;


import com.greenfoxacademy.restbackend.models.ArrayHandler;
import com.greenfoxacademy.restbackend.models.DoUntilValue;
import com.greenfoxacademy.restbackend.models.ErrorMessage;
import com.greenfoxacademy.restbackend.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    private DoublingServiceImpl doublingService;
    private GreetingServiceImpl greetingService;
    private AppendAServiceImpl appendAService;
    private DoUntilServiceImpl doUntilService;

    @Autowired
    public Controller(DoublingServiceImpl doublingService, GreetingServiceImpl greetingService, AppendAServiceImpl appendAService, DoUntilServiceImpl doUntilService) {
        this.doublingService = doublingService;
        this.greetingService = greetingService;
        this.appendAService = appendAService;
        this.doUntilService = doUntilService;
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

    @PostMapping("/dountil/{what}")
    public Object duUntil(@PathVariable(value = "what") String what, @RequestBody DoUntilValue doUntilValue) {
        if (doUntilValue.getUntil() == null) {
            return new ErrorMessage("Parameter is required");
        } else {
            return doUntilService.checkWhatIsTheOperation(what, doUntilValue.getUntil());
        }
    }
    @PostMapping ("/arrays")
    public Object arrayHandler(@RequestBody ArrayHandler arrayHandlerJson){

        return null;
    }

}
