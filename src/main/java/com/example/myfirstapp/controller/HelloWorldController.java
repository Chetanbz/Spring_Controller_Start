package com.example.myfirstapp.controller;


import com.example.myfirstapp.model.User.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("hello")
public class HelloWorldController {

    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "  Hello From Rest sayHello";
    }

//    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
//    public String sayHello(@RequestParam(value = "fName") String fName, @RequestParam(value = "lName") String lName) {
//        return "/n"+ "Hello " + fName + " " + lName + " !";
//    }

    @RequestMapping(value = {"/post"})
    public String sayHello(@RequestBody User user) {
        return "/n"+ "Hello " + user.getFirstName() + " " + user.getLastName() + "!";
    }

    @RequestMapping(value = {"/put/{firstName}"})
    public String sayHello(@PathVariable String firstName, @RequestParam(value="lastName") String lastName) {
        return "/n"+ "Hello " + firstName + " " + lastName + "!";
    }
}

