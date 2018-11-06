package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {
    @Autowired
    ColorRepository colorRepository;
    @Autowired
    PersonRepository personRepository;

    @RequestMapping("/colors/list")
    public  Iterable<Color> getAllColors(){
        return colorRepository.findAll();
    }

    @RequestMapping("/people/list")
    public  Iterable<Person> getAllPeople(){
        return personRepository.findAll();
    }

    @CrossOrigin
    @RequestMapping("/addperson")
    public String addPerson(@RequestBody Person person)
    {
        personRepository.save(person);
        return "A person has been added";
    }

    @CrossOrigin
    @RequestMapping("/addcolor")
    public String addPerson(@RequestBody Color color){
        colorRepository.save(color);
        return "A color has been added";
    }
}
