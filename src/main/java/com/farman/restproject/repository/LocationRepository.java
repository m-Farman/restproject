package com.farman.restproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farman.restproject.entity.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {

}
