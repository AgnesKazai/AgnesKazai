package com.greenfoxcompany.connectionwithmysql.controllers;

import com.greenfoxcompany.connectionwithmysql.models.Todo;
import com.greenfoxcompany.connectionwithmysql.services.AssigneeService;
import com.greenfoxcompany.connectionwithmysql.models.*;
import com.greenfoxcompany.connectionwithmysql.services.AssigneeServiceImpl;
import com.greenfoxcompany.connectionwithmysql.services.TodoService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class TodoController {

    private TodoService todoService;

    private AssigneeService assigneeService;

    @Autowired
    public TodoController(TodoService todoService, AssigneeService assigneeService) {
        this.todoService = todoService;
        this.assigneeService = assigneeService;
    }

    @GetMapping(value = {"/", "/list"})
    public String getTodosList(Model model) {
        model.addAttribute("todoslist", todoService.getAllTodos());
        return "todoslist";
    }

    @GetMapping(value = "/todo")
    public String listIsActive(@RequestParam(value = "isActive") boolean active, Model model) {
        model.addAttribute("todoslist", todoService.getActiveTodos(active));
        return "todoslist";
    }

    @GetMapping("/add")
    public String createTodo(Model model) {
        model.addAttribute("newTodo", new Todo());
        return "createtodo";
    }

    @PostMapping("/create")
    public String saveTodo(@ModelAttribute Todo todo) {
        todoService.saveTodo(todo);
        return "redirect:/list";
    }

    @PostMapping("/delete/{id}")
    public String deleteTodo(@PathVariable(value = "id") Long id) {
        todoService.removeById(id);
        return "redirect:/list";
    }

    @GetMapping("/edit/{id}")
    public String editTodo(@PathVariable(value = "id") Long id, Model model) {
        Optional<Todo> todo = todoService.getTodoById(id);
        model.addAttribute("edittodo", todo.get());
        model.addAttribute("assigneelist", assigneeService.getAllAssignees());
        return "editpage";
    }

    @PostMapping("/update/{id}")
    public String updateTodo(@PathVariable(value = "id") Long id, HttpServletRequest req,
                             @ModelAttribute Todo todo) {
        todo.setId(id);
        todoService.updateTodo(todo);
        Optional<Todo> needToEditTodo = todoService.getTodoById(id);
        Optional<Assignee> willBeAssigned = assigneeService.getAssigneeById(Long.parseLong(req.getParameter("assignee")));
        needToEditTodo.get().setAssignee(willBeAssigned.get());
//        needtoedittodo.setTitle(req.getParameter("settitle"));
//        needtoedittodo.setCreationTime(req.getParameter("setdate"));
//        needtoedittodo.setDuedate(req.getParameter("setdue"));
//        needtoedittodo.setDescription(req.getParameter("setdescription"));
//        needtoedittodo.setDone(Boolean.parseBoolean(req.getParameter("setdone")));
//        needtoedittodo.setUrgent(Boolean.parseBoolean(req.getParameter("seturgent")));
//        toDoServiceDB.save(needtoedittodo);
//        model.addAttribute("todo", toDoServiceDB.getToDo(id));
        return "redirect:/list";

    }

    @GetMapping("/search")
    public String searchByTitle(@RequestParam(value = "search") String title, Model model) {
        model.addAttribute("todoslist", todoService.searchByTitel(title));
        return "todoslist";
    }
}
