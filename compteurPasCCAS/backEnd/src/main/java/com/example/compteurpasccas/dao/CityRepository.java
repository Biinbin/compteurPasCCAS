package com.example.compteurpasccas.dao;

import com.example.compteurpasccas.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CityRepository extends JpaRepository<City, Long> {
    Optional<City> findById(int id);
}
