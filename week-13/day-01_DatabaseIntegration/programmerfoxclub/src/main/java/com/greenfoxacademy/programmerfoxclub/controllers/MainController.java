package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.services.FoxServiceImpl;
import com.greenfoxacademy.programmerfoxclub.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    private final FoxServiceImpl foxServiceImpl;
    private UserServiceImpl userServiceImpl;

    @Autowired
    public MainController(FoxServiceImpl foxServiceImpl, UserServiceImpl userServiceImpl) {
        this.foxServiceImpl = foxServiceImpl;
        this.userServiceImpl = userServiceImpl;
    }

    @GetMapping("/")
    public String getMainPage() {
        return "login";
    }

    @GetMapping("/login")
    public String renderLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String getLoginName(@ModelAttribute(value = "username") String name,
                               @ModelAttribute(value = "password") String password,
                               Model model) {
        if (userServiceImpl.login(name, password) != null){
            model.addAttribute("fox", userServiceImpl.login(name, password).getFox());
            return "index" ;
        }
        return "redirect:/register";
    }

    @GetMapping(value = "/index/")
    public String mainPageWithoutName(Model model) {
        model.addAttribute("name", "noParameter");
        return "login";
    }

    @GetMapping(value = "/index/{foxname}")
    public String mainPage(Model model, @PathVariable String foxname) {
        model.addAttribute("fox", foxServiceImpl.findOne(foxname));
        return "index";
    }

    @GetMapping("/nutritionStore/{foxname}")
    public String getNutritionStore(@PathVariable String foxname, Model model) {
        model.addAttribute("fox", foxServiceImpl.findOne(foxname));
        model.addAttribute("foods", foxServiceImpl.getFoodValues());
        model.addAttribute("drinks", foxServiceImpl.getDrinkValues());
        return "nutritionStore";
    }

    @GetMapping("/trickCenter/{foxname}")
    public String getTrickCenter(@PathVariable String foxname, Model model) {
        model.addAttribute("fox", foxServiceImpl.findOne(foxname));
        model.addAttribute("tricks", foxServiceImpl.findOne(foxname).getListOfAvailableTricks());
        return "trickCenter";
    }

}

