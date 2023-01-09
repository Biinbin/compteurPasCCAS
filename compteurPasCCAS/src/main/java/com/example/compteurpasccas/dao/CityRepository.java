package com.example.compteurpasccas.dao;

import com.example.compteurpasccas.entity.City;

import java.util.Optional;

public interface CityRepository {
    Optional<City> findById(int id);


}
