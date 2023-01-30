package com.example.compteurpasccas.dao;

import com.example.compteurpasccas.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface CityRepository extends JpaRepository<City, Long> {
    List<City> findById(int id);

}
