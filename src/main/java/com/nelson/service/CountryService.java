package com.nelson.service;

import com.nelson.model.Country;

import java.util.List;

public interface CountryService {

    List<Country> showCountries();

    void saveCountry(Country country);
}
