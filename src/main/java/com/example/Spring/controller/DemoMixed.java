package com.example.Spring.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoMixed {

    @RequestMapping("/add")
    public String addition() {
        int a = 74;
        int b = 63;
        int c = a + b;
        return "addition is: " + c;
    }

    @RequestMapping("/plus")
    public int addition2() {
        int a = 12;
        int b = 12;
        int c = a + b;
        return c;
    }

    @RequestMapping("/addify/{a}/{b}")
    public String addition3(@PathVariable int a, @PathVariable int b) {
        int c = a + b;
        return "addition is: " + c;

    }

    @RequestMapping("/minus/{a}/{b}")
    public int subtract(@PathVariable int a, @PathVariable int b) {
        int c = a - b;
        return c;
    }

    @RequestMapping("/division/{a}/{b}")
    public String divide(@PathVariable int a, @PathVariable int b) {
        int c = a / b;
        return "division is: " + c;
    }

    @RequestMapping("/multiplication/{a}/{b}")
    public int multiply(@PathVariable int a, @PathVariable int b) {
        int c = a * b;
        return c;
    }

    @RequestMapping("/hello/{name}")
    public String message(@PathVariable String name){
        return "Hi, Welcome to India.."+name;

    }

    @RequestMapping("/your_age/{age}")
    public String checkAge(@PathVariable int age){
        if (age>18){
            return "You are eligible for voting";
        }
        else{
            return "you are not eligible for voting";
        }
    }

    @RequestMapping("/your_salary/{salary}")
    public String checkSalary(@PathVariable int salary){
        if (salary>100000){
            return "your package is high";
        }
        else{
            return "Your package is low";
        }
    }

    @RequestMapping("/java")
    public String msg(){
        return "JAVA, PYTHON,JAVASCRIPT";

    }

    @RequestMapping("/salary")
    public double yourSalary(){
        return 265235.541;
    }

    @RequestMapping("/num")
    public int number(){
        return 54;
    }

}


