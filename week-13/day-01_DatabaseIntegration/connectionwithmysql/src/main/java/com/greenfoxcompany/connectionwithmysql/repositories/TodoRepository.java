package com.greenfoxcompany.connectionwithmysql.repositories;

import com.greenfoxcompany.connectionwithmysql.models.Assignee;
import com.greenfoxcompany.connectionwithmysql.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

    List<Todo> findByDoneFalse();

    List<Todo> findByDoneTrue();

    List<Todo> findByTitleContaining(String title);

    List<Todo> findTodosByAssignee(Assignee assignee);

    List<Todo> findByDueDate(String dueDate);

    List<Todo> findByAssigneeName(String assignee);


}
