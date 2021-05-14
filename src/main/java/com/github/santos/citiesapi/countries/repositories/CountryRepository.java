package com.github.santos.citiesapi.countries.repositories;

import com.github.santos.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
