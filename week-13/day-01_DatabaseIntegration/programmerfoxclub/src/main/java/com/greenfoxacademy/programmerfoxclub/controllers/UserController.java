package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.models.User;
import com.greenfoxacademy.programmerfoxclub.services.FoxServiceImpl;
import com.greenfoxacademy.programmerfoxclub.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    private UserService userService;
    private FoxServiceImpl foxServiceImpl;

    @Autowired
    public UserController(UserService userService, FoxServiceImpl foxServiceImpl) {
        this.userService = userService;
        this.foxServiceImpl = foxServiceImpl;
    }

    @GetMapping("/register")
    public String renderRegisterPage() {
        return "register";
    }

    @PostMapping("/register")
    public String saveUsernameAndPassword(@ModelAttribute(value = "username") String username,
                                         @ModelAttribute(value = "psw") String psw,
                                         @ModelAttribute(value = "pswrepeat") String psvrepeat){
        if(psw.equals(psvrepeat)){
            User newUser = new User();
            newUser.setUsername(username);
            newUser.setPassword(psw);
            newUser.setFox(foxServiceImpl.newFox("GreenFox"));
            userService.saveUser(newUser);
            return "redirect:/login";
        }
        return "redirect:/register";
    }
}
