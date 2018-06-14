package com.greenfoxacademy.greenfoxclassapp.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    ArrayList<String> names;

    public StudentServiceImpl() {
        names = new ArrayList<>();
        names.add("Sanyi");
        names.add("Lilla");
        names.add("John");
    }

    @Override
    public List<String> findAll() {
        return names;
    }

    @Override
    public void save(String studentName) {
        names.add(studentName);
    }

    @Override
    public int counter() {
        return names.size();
    }

    @Override
    public int isAlreadyInTheList(String studentName) {
        if (names.contains(studentName)) {
            return 1;
        } else {
            return 2;
        }
    }
}

