package com.nelson.controller;

import com.nelson.model.Country;
import com.nelson.service.CountryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class CountryController {

    private CountryService countryService;

    @GetMapping("/country")
    public String showCountries(Model model){
        List<Country> countryList = countryService.showCountries();
        model.addAttribute("countries", countryList);
        return "country";
    }

    @PostMapping("/country/new")
    public String saveCountry(Country country){
        countryService.saveCountry(country);
        return "redirect:/country";
    }

}
