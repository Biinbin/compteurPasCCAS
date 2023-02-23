package com.example.compteurpasccas.dao;

import com.example.compteurpasccas.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;


import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface CityRepository extends JpaRepository<City, Long> {
    Optional<City> findById(int id);
    default void changeCityState(City city){
        city.setEstDebloquee(true);
    }
}
