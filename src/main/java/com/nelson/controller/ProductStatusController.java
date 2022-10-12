package com.nelson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductStatusController {

    @GetMapping("/status")
    public String showStatus(){
        return "product-status";
    }
}
