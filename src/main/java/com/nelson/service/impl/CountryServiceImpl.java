package com.nelson.service.impl;

import com.nelson.model.Country;
import com.nelson.repository.CountryRepository;
import com.nelson.service.CountryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CountryServiceImpl implements CountryService {

    private CountryRepository countryRepository;

    @Override
    public List<Country> showCountries() {
        return countryRepository.findAll();
    }

    @Override
    public void saveCountry(Country country) {
        countryRepository.save(country);
    }
}
