package com.greenfoxacademy.greenfoxclassapp.controllers;

import com.greenfoxacademy.greenfoxclassapp.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StrudentController {

    private final
    StudentService studentService;

    @Autowired
    public StrudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/gfa")
    public String renderingMainPage(Model model) {
        model.addAttribute("counter", studentService.counter());
        return "mainpage";
    }

    @GetMapping("/gfa/list")
    public String showStudentsList(Model model) {
        model.addAttribute("names", studentService.findAll());
        return "studentslist";
    }

    @GetMapping("/gfa/add")
    public String addNewStudent(Model model, String studentName) {
        model.addAttribute("name", studentName);
        return "addform";
    }

    @PostMapping("/gfa/save")
    public String saveStudentName(@RequestParam(value = "studentName") String studentName, Model model) {
        studentService.save(studentName);
        model.addAttribute("student", studentService);
        return "redirect:list";
    }

    @GetMapping("/gfa/check")
    public String checkNameIn(Model model) {
        return "check";
    }

    @PostMapping("/gfa/check")
    public String checkNameOut(@RequestParam(value = "studentName") String studentName, Model model) {
        model.addAttribute("isInTheList", studentService.isAlreadyInTheList(studentName));
        return "check";
    }
}
