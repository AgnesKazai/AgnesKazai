package com.greenfoxcompany.connectionwithmysql.controllers;

import com.greenfoxcompany.connectionwithmysql.models.Assignee;
import com.greenfoxcompany.connectionwithmysql.services.AssigneeServiceImpl;
import com.greenfoxcompany.connectionwithmysql.services.TodoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class AssigneeController {

    private AssigneeServiceImpl assigneeService;

    private TodoServiceImpl todoService;

    @Autowired
    public AssigneeController(AssigneeServiceImpl assigneeService, TodoServiceImpl todoService) {
        this.assigneeService = assigneeService;
        this.todoService = todoService;
    }

    @GetMapping("/assigneelist")
    public String getAssigneesList(Model model) {
        model.addAttribute("assigneelist", assigneeService.getAllAssignees());
        return "assigneelist";
    }

    @GetMapping("/editassignee/{id}")
    public String editAssignee(@PathVariable(value = "id") Long id, Model model) {
        Optional<Assignee> assignee = assigneeService.getAssigneeById(id);
        model.addAttribute("editassignee", assignee.get());
        return "editassigneepage";
    }

    @PostMapping("/editassignee/{id}")
    public String updateAssignee(@PathVariable(value = "id") Long id, @ModelAttribute Assignee assignee) {
        assignee.setId(id);
        assigneeService.updateAssignee(assignee);
        return "redirect:/assigneelist";
    }

    @PostMapping("/deleteassignee/{id}")
    public String deleteAssignee(@PathVariable(value = "id") Long id) {
        assigneeService.deleteAssignee(id);
        return "redirect:/assigneelist";
    }

    @GetMapping("/addassignee")
    public String addAssignee(Model model) {
        model.addAttribute("assignee", new Assignee());
        return "createassignee";
    }

    @PostMapping("/createassignee")
    public String createAssignee(@ModelAttribute Assignee assignee) {
        assigneeService.save(assignee);
        return "redirect:/assigneelist";
    }

    @GetMapping(value = {"assignee/{id}"})
    public String getAssigneeTodos(@PathVariable(value = "id") Long id, Model model) {
        Optional<Assignee> assignee = assigneeService.getAssigneeById(id);
        model.addAttribute("ListOfAssigneeTodos", todoService.getTodosByAssignee(assignee.get()));
        return "assigneestodos";
    }
}
