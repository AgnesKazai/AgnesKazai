package com.greenfoxcompany.connectionwithmysql.services;

import com.greenfoxcompany.connectionwithmysql.models.Assignee;
import com.greenfoxcompany.connectionwithmysql.models.Todo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface AssigneeService {

    List<Assignee> getAllAssignees();

    Optional<Assignee> getAssigneeById(Long id);

    void updateAssignee(Assignee assignee);

    void deleteAssignee(Long id);

    Assignee save(Assignee assignee);
}
