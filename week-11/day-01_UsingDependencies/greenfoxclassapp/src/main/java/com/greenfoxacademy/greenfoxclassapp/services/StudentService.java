package com.greenfoxacademy.greenfoxclassapp.services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    List<String> findAll();

    void save(String student);

    int counter();

    int isAlreadyInTheList(String studentName);
}

