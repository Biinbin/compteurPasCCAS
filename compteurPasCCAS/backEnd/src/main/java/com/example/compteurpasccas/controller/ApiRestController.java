package com.example.compteurpasccas.controller;

import com.example.compteurpasccas.dao.CityRepository;
import com.example.compteurpasccas.entity.Cities;
import com.example.compteurpasccas.entity.City;
import com.example.compteurpasccas.entity.Counter;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api")
public class ApiRestController {
    Counter counter = new Counter((float) 0);

    @Autowired
    private CityRepository cityRepository;

    // Request Mapping pour les villes
    @GetMapping(path = "/city")
    public Cities getAllCities(){
        return new Cities(cityRepository.findAll());
    }

    @GetMapping(path = "/city/{id}")
    public Optional<City> getCityById(@PathVariable Integer id){
        return cityRepository.findById(id);
    }

    @GetMapping(path = "/city/info/{id}")
    public JSONObject findInfoById(@PathVariable Integer id){
        JSONObject json = new JSONObject();
        json.put("informations", cityRepository.findById(id).get().informations);
        return json;
    }

    // Request Mapping pour le compteur
    @GetMapping(path = "/counter")
    public JSONObject getCounter(){
        return counter.getDistanceKm();
    }

    @PutMapping(path = "/counter/steps")
    public Counter updateCounterValueInSteps(@RequestBody Counter updatedCounter) {
        counter.ajouteDistancePas(updatedCounter.getValue());
        return updatedCounter;
    }

    @PutMapping(path = "/counter/km")
    public Counter updateCounterValueInKm(@RequestBody Counter updatedCounter) {
        counter.ajouteDistanceKm(updatedCounter.getValue());
        return updatedCounter;
    }
}