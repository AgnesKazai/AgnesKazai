package com.greenfoxcompany.connectionwithmysql.repositories;

import com.greenfoxcompany.connectionwithmysql.models.Assignee;
import org.springframework.data.repository.CrudRepository;


public interface AssigneeRepository extends CrudRepository <Assignee, Long> {

    Assignee findByName(String name);
}
