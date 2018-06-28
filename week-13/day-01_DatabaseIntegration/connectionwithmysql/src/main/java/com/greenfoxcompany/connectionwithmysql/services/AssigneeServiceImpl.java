package com.greenfoxcompany.connectionwithmysql.services;

import com.greenfoxcompany.connectionwithmysql.models.Assignee;
import com.greenfoxcompany.connectionwithmysql.models.Todo;
import com.greenfoxcompany.connectionwithmysql.repositories.AssigneeRepository;
import com.greenfoxcompany.connectionwithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AssigneeServiceImpl implements AssigneeService {

    private AssigneeRepository assigneeRepository;

    private TodoRepository todoRepository;

    @Autowired
    public AssigneeServiceImpl(AssigneeRepository assigneeRepository, TodoRepository todoRepository) {
        this.assigneeRepository = assigneeRepository;
        this.todoRepository = todoRepository;
    }

    @Override
    public List<Assignee> getAllAssignees() {
        List<Assignee> assignees = new ArrayList<>();
        assigneeRepository.findAll().forEach(assignees::add);
        return assignees;
    }

    @Override
    public Optional<Assignee> getAssigneeById(Long id) {
        return assigneeRepository.findById(id);
    }

    @Override
    public void updateAssignee(Assignee assignee) {
        assigneeRepository.save(assignee);
    }

    @Override
    public void deleteAssignee(Long id) {
        assigneeRepository.deleteById(id);
    }

    @Override
    public Assignee save(Assignee assignee) {
        return assigneeRepository.save(assignee);
    }
}
