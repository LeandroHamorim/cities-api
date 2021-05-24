package com.github.LeandroHamorim.citiesapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.LeandroHamorim.citiesapi.countries.Country;
import com.github.LeandroHamorim.citiesapi.repository.CountryRepository;

@RestController
@RequestMapping("/countries")
public class CountryResource {
	@Autowired
	private CountryRepository repository;
	
	@GetMapping
	public List<Country> countries(){
		
		return repository.findAll();
	}

}
