package com.greenfox.error.model.controller;

import com.greenfox.error.model.service.UserService;
import com.greenfox.error.model.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by aze on 25/10/17.
 */
@Controller
@RequestMapping("/")
public class AppController {

    private UserService service;

    @Autowired
    public AppController(UserService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("yolo", service.getAll());
        return "index";
    }

    @PostMapping("/app")
    public String create(@ModelAttribute User user) {
        service.save(user);
        return "redirect:/";
    }
}
