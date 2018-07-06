package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.User;
import com.greenfoxacademy.programmerfoxclub.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User login(String userName, String password) {
        for (User user : userRepository.getUsers()) {
            if(userName.equals(user.getUsername())){
                if (password.equals(user.getPassword())){
                    return user;
                } else return null;
            } else return null;
        }
        return null;
    }

    @Override
    public void saveUser(User newuser) {
        userRepository.save(newuser);
    }

}
