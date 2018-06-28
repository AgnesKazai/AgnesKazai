package com.greenfoxcompany.connectionwithmysql.controllers;

import com.greenfoxcompany.connectionwithmysql.models.Assignee;
import com.greenfoxcompany.connectionwithmysql.services.AssigneeService;
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

    private AssigneeService assigneeService;

    @Autowired
    public AssigneeController(AssigneeService assigneeService) {
        this.assigneeService = assigneeService;
    }

    @GetMapping("/assignees")
    public String getAssigneesList(Model model) {
        model.addAttribute("assigneeslist", assigneeService.getAllAssignees());
        return "assigneeslist";
    }

//    @GetMapping("/editassigneesname/{id}")
//    public String editAssigneesName(@PathVariable(value = "id") Long id, Model model) {
//        Optional<Assignee> assignee = assigneeService.getAssigneeById(id);
//        model.addAttribute("editassignee", assignee.get());
//        return "editassigneepage";
//    }
//
//    @PostMapping("/editassigneesname/{id}")
//    public String updateAssigneesName(@PathVariable(value = "id") Long id, @ModelAttribute Assignee assignee) {
//        assignee.getId(id);
//        assigneeService.updateAssignee(assignee);
//        return "redirect:/assigneeslist";
//    }


}
