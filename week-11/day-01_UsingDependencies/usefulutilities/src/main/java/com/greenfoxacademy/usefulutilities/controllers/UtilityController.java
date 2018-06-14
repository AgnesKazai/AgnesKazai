package com.greenfoxacademy.usefulutilities.controllers;

import com.greenfoxacademy.usefulutilities.services.UtilityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UtilityController {

    UtilityServiceImpl utilityService;

    @Autowired
    public UtilityController(UtilityServiceImpl utilityService) {
        this.utilityService = utilityService;
    }

    @GetMapping("/useful")
    public String renderMainPage() {
        return "useful";
    }

    @GetMapping("/useful/colored")
    public String coloredBackground(Model model) {
        model.addAttribute("color", utilityService.randomColor());
        return "colored";
    }

    @GetMapping("/useful/email")
    public String takeEmail(@RequestParam(value = "email") String email, Model model) {
        model.addAttribute("mail", email);
        model.addAttribute("emailValue", utilityService.validateEmail(email));
        return "emailPage";
    }

    @GetMapping("/useful/caesarencoder")
    public String encoding(Model model, @RequestParam(value = "text") String text, @RequestParam(value = "number") int number) {
        model.addAttribute("text", utilityService.caesarEncoder(text, number));
        model.addAttribute("number", number);
        return "caesarencoder";

    }

    @GetMapping("/useful/caesardecoder")
    public String decoding(Model model, @RequestParam(value = "text") String text, @RequestParam(value = "number") int number) {
        model.addAttribute("text", utilityService.caesarDecoder(text, number));
        model.addAttribute("number", number);
        return "caesardecoder";
    }
}

