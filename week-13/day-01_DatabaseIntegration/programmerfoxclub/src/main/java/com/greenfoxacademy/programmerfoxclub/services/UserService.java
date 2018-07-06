package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.User;
import com.greenfoxacademy.programmerfoxclub.repositories.UserRepository;

import java.util.List;

public interface UserService {

    User login(String userName, String password);

    void saveUser(User newuser);

}
