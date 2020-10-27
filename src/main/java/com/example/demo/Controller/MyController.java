package com.example.demo.Controller;

import com.example.demo.DAO.PersonDAO;
import com.example.demo.Entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private PersonDAO personDAO;
    @GetMapping("/home")
    public String home(){
        return "Hello Spring Boot";
    }
    @PostMapping("/add")
    public Person add(@RequestBody Person person){
        personDAO.save(person);
     return person;
    }
    @GetMapping("/allData")
    public List<Person> getAllData(){
        return personDAO.findAll();
    }
}
