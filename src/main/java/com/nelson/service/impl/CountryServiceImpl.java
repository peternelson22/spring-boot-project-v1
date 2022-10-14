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

    @Override
    public Country updateCountry(Long id, Country country) {
        Country existingCountry = countryRepository.findById(id).get();
        existingCountry.setId(id);
        existingCountry.setCapital(country.getCapital());
        existingCountry.setCode(country.getCode());
        existingCountry.setContinent(country.getContinent());
        existingCountry.setDescription(country.getDescription());
        existingCountry.setNationality(country.getNationality());

       return countryRepository.save(existingCountry);
    }

    @Override
    public Country getCountryById(Long id) {
        return countryRepository.findById(id).orElseThrow(() -> new IllegalStateException("Country not found"));
    }

    @Override
    public void deleteCountryById(Long id) {
        countryRepository.deleteById(id);
    }
}
