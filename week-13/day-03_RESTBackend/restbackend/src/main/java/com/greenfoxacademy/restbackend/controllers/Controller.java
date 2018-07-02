package com.greenfoxacademy.restbackend.controllers;


import com.greenfoxacademy.restbackend.models.*;
import com.greenfoxacademy.restbackend.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
public class Controller {

    private DoublingServiceImpl doublingService;
    private GreetingServiceImpl greetingService;
    private AppendAServiceImpl appendAService;
    private LogServiceImpl logService;

    @Autowired
    public Controller(DoublingServiceImpl doublingService, GreetingServiceImpl greetingService, AppendAServiceImpl appendAService, LogServiceImpl logService) {
        this.doublingService = doublingService;
        this.greetingService = greetingService;
        this.appendAService = appendAService;
        this.logService = logService;
    }

    @GetMapping("/doubling")
    public Object getDoubleValue(@RequestParam(value = "input", required = false) Integer recieved) {
        String endpoint = "/doubling";
        String data = "input= " + recieved;
        logService.saveLog(new Log(endpoint, data));
        return doublingService.getResult(recieved);
    }

    @GetMapping("/greeter")
    public Object getGreeting(@RequestParam(value = "name", required = false) String name,
                              @RequestParam(value = "title", required = false) String title) {
        String endpoint = "/greeter";
        String data = "name = " + name + " &title = " + title;
        logService.saveLog(new Log(endpoint, data));
        return greetingService.getWelcomeMessage(name, title);
    }

    @GetMapping("/appenda/{appendable}")
    public Object getGreeting(@PathVariable(value = "appendable") String appendable) {
        String endpoint = "/appenda/{appendable}";
        String data = "appendable = " + appendable;
        logService.saveLog(new Log(endpoint, data));
        return appendAService.getAppendA(appendable);
    }

    @PostMapping("/dountil/{what}")
    public Object duUntil(@PathVariable(value = "what") String what, @RequestBody DoUntilValue doUntilValue) {
        String endpoint = "/dountil/{what}";
        String data = "what =" + what + " input =" + doUntilValue.getUntil();

        if (doUntilValue.getUntil() == 0) {
            return new ErrorMessage("Parameter is required");
        } else {
            logService.saveLog(new Log(endpoint, data));
            return new DoUntilSumAndFactor(what, doUntilValue.getUntil());
        }
    }

    @PostMapping("/arrays")
    public Object arrayHandler(@RequestBody ArrayHandler arrayHandlerJson) {
        String endpoint = "/arrays";
        String data = "what= " + arrayHandlerJson.getWhat() + " numbers=" + Arrays.toString(arrayHandlerJson.getNumbers());
        logService.saveLog(new Log(endpoint, data));
        String what = arrayHandlerJson.getWhat();
        int[] numbers = arrayHandlerJson.getNumbers();
        if (what != null && numbers != null) {
            if (what.equals("sum")) {
                return new ArrayHandlerSumAndMultiply(what, numbers);
            } else if (what.equals("multiply")) {
                return new ArrayHandlerSumAndMultiply(what, numbers);
            } else if (what.equals("double")) {
                return new ArrayHandlerDouble(what, numbers);
            }
        }
        return new ErrorMessage("Please provide what to do with the numbers!");
    }

    @GetMapping("/log")
    public Object getLogs() {
        return new LogJson(logService.getAllLogs());
    }

    @PostMapping("/sith")
    public Object sith(@RequestBody Sith sithJson) {
        String endpoint = "/sith";
        String data = sithJson.getText();
        logService.saveLog(new Log(endpoint, data));
        if (sithJson.getText() != null) {
            return new SithReverse(sithJson.getText());
        }
        return new ErrorMessage("Feed me some text you have to, padawan young you are. Hmmm.");
    }

}
