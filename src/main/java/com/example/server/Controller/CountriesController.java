package com.example.server.Controller;

import com.example.server.entity.Countries;
import com.example.server.repository.CountriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountriesController {

    @Autowired
    CountriesRepository countriesRepository;

    @GetMapping("/all")
    public ResponseEntity<?> getAllCountries(){
        List<Countries> countries = countriesRepository.findAll();
        return ResponseEntity.ok(countries);
    }
}
