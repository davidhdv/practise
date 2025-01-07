package org.example.demopractise.controller;

import org.springframework.web.bind.annotation.*;

@RestController

public class DataController {
    @RequestMapping(value = "/data",method = RequestMethod.GET)
    public String getData() {
        return "Hello from Spring Boot!";
    }

}
