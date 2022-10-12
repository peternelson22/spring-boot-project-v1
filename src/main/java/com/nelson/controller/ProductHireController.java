package com.nelson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductHireController {

    @GetMapping("/hire")
    public String showProductHire(){
        return "product-hire";
    }
}
