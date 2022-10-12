package com.nelson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductMakeController {

    @GetMapping("/make")
    public String showMake(){
        return "product-make";
    }
}
