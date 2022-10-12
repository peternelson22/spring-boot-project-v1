package com.nelson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductMaintenanceController {

    @GetMapping("/maintenance")
    public String showMaintenance(){
        return "product-maintenance";
    }
}
