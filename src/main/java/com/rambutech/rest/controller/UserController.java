package com.rambutech.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chathuraka on 11/5/16.
 */
@RestController
public class UserController  {

    @RequestMapping(value = "/api/users/greeting", method = RequestMethod.GET)
    public String greeting(){
        return "Hello Greetings";
    }

    @RequestMapping("/")
    public String helloWorld(){
        return "Hello World";
    }
}
