package com.nelson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductTypeController {

    @GetMapping("/type")
    public String showType(){
        return "product-type";
    }
}
