package com.example.compteurpasccas.controller;

import com.example.compteurpasccas.dao.CityRepository;
import com.example.compteurpasccas.entity.City;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("api")
public class RestController {
    private CityRepository cityRepository;
    List<City> cities = new ArrayList<City>();

    public int findMaxId(List<City> cities) {
        return cities.stream()
                .mapToInt(City::getId)
                .max()
                .orElse(0);
    }

    @GetMapping(path = "/city/{id}")
    Optional<City> getCityById(@PathVariable Integer id){
        return cities.stream()
                .filter(c -> c.getId() == id)
                .findFirst();
    }

    @GetMapping(path = "/city")
    List<City> getCity(){
        return cities;
    }

    @PostMapping(path = "/city", consumes = "application/json")
    List<City> addCity(@RequestBody City city){
        city.setId(findMaxId(cities) + 1);
        cities.add(city);
        return cities;
    }
}
