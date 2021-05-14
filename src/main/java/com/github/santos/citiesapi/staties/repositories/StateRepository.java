package com.github.santos.citiesapi.staties.repositories;

import com.github.santos.citiesapi.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
