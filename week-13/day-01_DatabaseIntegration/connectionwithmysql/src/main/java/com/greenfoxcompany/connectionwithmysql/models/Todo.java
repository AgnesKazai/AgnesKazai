package com.greenfoxcompany.connectionwithmysql.models;

import javax.persistence.*;

@Entity
public class Todo {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private Boolean done;
    private Boolean urgent;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "assignee_id")
    private Assignee assignee;

    public Todo() {
    }

    public Todo(String title, Boolean done, Boolean urgent) {
        this.title = title;
        this.done = done;
        this.urgent = urgent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public Boolean getUrgent() {
        return urgent;
    }

    public void setUrgent(Boolean urgent) {
        this.urgent = urgent;
    }

    public Assignee getAssignee() {
        return assignee;
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }
}
