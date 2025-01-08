package org.example.demopractise.service.impl;
import org.example.demopractise.service.DataService;
import org.springframework.stereotype.Service;

@Service
public class DataServiceImpl implements DataService {
    public String login(String name, String password) {
        String name1 = name;
        String password1 = password;
        return "hello"+name1+password1;


    }
}
