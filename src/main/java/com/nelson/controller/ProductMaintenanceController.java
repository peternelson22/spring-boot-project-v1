package com.nelson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductMaintenanceController {

    @GetMapping("/servicing")
    public String showMaintenance(){
        return "product-maintenance";
    }
}
