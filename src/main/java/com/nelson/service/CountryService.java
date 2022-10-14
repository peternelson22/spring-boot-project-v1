package com.nelson.service;

import com.nelson.model.Country;

import java.util.List;

public interface CountryService {

    List<Country> showCountries();

    void saveCountry(Country country);

    Country updateCountry(Long id, Country country);

    Country getCountryById(Long id);

    void deleteCountryById(Long id);
}
