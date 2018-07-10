package com.greenfoxcompany.yonduarrow.controller;

import com.greenfoxcompany.yonduarrow.model.Arrow;
import com.greenfoxcompany.yonduarrow.model.ErrorMessage;
import com.greenfoxcompany.yonduarrow.model.RestResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YonduArrowController {

    @GetMapping("/yondu")
    public ResponseEntity<RestResponse> getArrowsSpeed(@RequestParam(value = "distance", required = false) Double distance,
                                                       @RequestParam(value = "time", required = false) Double time) {
        if (distance == null || time == null) {
            return new ResponseEntity<>(new ErrorMessage("Please, provide parameters!"), HttpStatus.BAD_REQUEST);
        } else if (time == 0) {
            return new ResponseEntity<>(new ErrorMessage("Time cannot be zero!"), HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(new Arrow(distance, time), HttpStatus.OK);
        }
    }
}

