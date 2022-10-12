package com.nelson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeUserController {

    @GetMapping("/employee-user")
    public String showEmployeeUser(){
        return "employee-user";
    }
}
