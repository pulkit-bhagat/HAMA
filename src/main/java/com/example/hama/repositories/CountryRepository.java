package com.example.hama.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hama.models.Country;

@Repository

public interface CountryRepository extends JpaRepository<Country, Integer> {

}
