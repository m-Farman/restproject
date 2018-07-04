package com.farman.restproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farman.restproject.entity.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

}
