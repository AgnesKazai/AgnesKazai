package com.greenfoxacademy.restbackend.services;

import com.greenfoxacademy.restbackend.models.AppendA;
import com.greenfoxacademy.restbackend.models.ErrorMessage;
import org.springframework.stereotype.Service;

@Service
public class AppendAServiceImpl implements AppendAService {
    @Override
    public Object getAppendA(String appendable) {
        return new AppendA(appendable);

    }
}
