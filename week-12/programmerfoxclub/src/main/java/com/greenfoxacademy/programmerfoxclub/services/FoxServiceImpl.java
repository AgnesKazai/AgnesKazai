package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Drink;
import com.greenfoxacademy.programmerfoxclub.models.Food;
import com.greenfoxacademy.programmerfoxclub.models.Fox;
import com.greenfoxacademy.programmerfoxclub.repositories.FoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoxServiceImpl implements FoxService {

    private final FoxRepository foxRepository;

    @Autowired
    public FoxServiceImpl(FoxRepository foxRepository) {
        this.foxRepository = foxRepository;
    }

    public Boolean isExist(String foxname) {
        return foxRepository.isExist(foxname);
    }

    public Fox login(String foxname) {
        if (foxRepository.isExist(foxname)) {
            return foxRepository.findByName(foxname);
        } else {
            Fox newFox = new Fox(foxname);
            foxRepository.save(newFox);
            return newFox;
        }
    }

    public Fox findOne(String name) {
        return foxRepository.findByName(name);
    }

    public List<Food> getFoodValues() {
        return foxRepository.getFoodValues();
    }

    public List<Drink> getDrinkValues() {
        return foxRepository.getDrinkValues();
    }
}
