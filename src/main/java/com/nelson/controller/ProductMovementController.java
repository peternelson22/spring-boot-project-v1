package com.nelson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductMovementController {

    @GetMapping("/movement")
    public String showMovement(){
        return "product-movement";
    }
}
