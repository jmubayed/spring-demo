package com.example.demo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Test")
public class ExecuteTest {

    @RequestMapping(value = "/ExecuteTest", method = RequestMethod.POST)
    public ResponseEntity executeTest(@RequestBody String jsonTest){
        return new ResponseEntity("el test a ido bien", HttpStatus.CREATED);
    }

}
