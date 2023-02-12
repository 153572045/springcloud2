package com.cxx.test.controller;

import com.cxx.test.entities.People;
import com.cxx.test.service.PeopleService;
import com.cxx.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class MainController {

    @Autowired
    private TestService testService;

    @Autowired
    private PeopleService peopleService;

    @GetMapping("/index")
    public String sayHellow() {
        return "say hello";
    }

    @GetMapping("/people")
    public People getPeople() {
        People people = testService.getPeople();
        return people;
    }

    @GetMapping("/last")
    public List<People> getP() {
        return peopleService.findPeoples();
    }
}
