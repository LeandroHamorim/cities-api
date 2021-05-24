package com.github.LeandroHamorim.citiesapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.LeandroHamorim.citiesapi.countries.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
