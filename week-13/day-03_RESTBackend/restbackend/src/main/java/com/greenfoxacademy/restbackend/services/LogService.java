package com.greenfoxacademy.restbackend.services;

import com.greenfoxacademy.restbackend.models.Log;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LogService {

    List<Log> getAllLogs();

    void saveLog(Log log);


}
