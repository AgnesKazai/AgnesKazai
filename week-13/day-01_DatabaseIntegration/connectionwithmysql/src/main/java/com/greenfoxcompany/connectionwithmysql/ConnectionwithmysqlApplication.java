package com.greenfoxcompany.connectionwithmysql;

import com.greenfoxcompany.connectionwithmysql.models.Assignee;
import com.greenfoxcompany.connectionwithmysql.models.Todo;
import com.greenfoxcompany.connectionwithmysql.repositories.AssigneeRepository;
import com.greenfoxcompany.connectionwithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionwithmysqlApplication implements CommandLineRunner {

    private
    TodoRepository todoRepository;

    private
    AssigneeRepository assigneeRepository;

    @Autowired
    public ConnectionwithmysqlApplication(TodoRepository todoRepository, AssigneeRepository assigneeRepository) {
        this.todoRepository = todoRepository;
        this.assigneeRepository = assigneeRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ConnectionwithmysqlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("daily task", false, false));
        todoRepository.save(new Todo("make the beds", true, true));
        todoRepository.save(new Todo("do the washing up", true, false));
        todoRepository.save(new Todo("clean the bathroom.", true, true));
        todoRepository.save(new Todo("sweep the floor", true, true));
        todoRepository.save(new Todo("wash the floors", true, false));
        todoRepository.save(new Todo("vacuum the carpet", false, false));
        todoRepository.save(new Todo("dust the furniture", false, true));
        todoRepository.save(new Todo("tidy up", false, true));

        assigneeRepository.save(new Assignee("John Doe", "john@gmail.com"));
        assigneeRepository.save(new Assignee("Samuel L Jackson", "jack@hotmail.com"));
        assigneeRepository.save(new Assignee("Jackie Chan", "jackie@gmail.com"));
        assigneeRepository.save(new Assignee("John Wick", "wick@freemail.com"));
        assigneeRepository.save(new Assignee("Arnold S.", "ari@gmail.com"));
    }
}
