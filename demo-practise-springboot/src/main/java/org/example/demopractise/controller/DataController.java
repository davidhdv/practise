package org.example.demopractise.controller;

import org.example.demopractise.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class DataController {
    @Autowired
    private DataService dataService;
    @RequestMapping(value = "/data",method = RequestMethod.GET)
    public String getData() {
        return "Hello from Spring Boot!";
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(String name,String password) {
        String name1 = name;
        String password1 = password;
        String stringdata=dataService.login(name,password);


        return "Hello world!";
    }

}
