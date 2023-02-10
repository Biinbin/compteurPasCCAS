package com.example.compteurpasccas.controller;

import com.example.compteurpasccas.dao.CityRepository;
import com.example.compteurpasccas.entity.City;
import com.example.compteurpasccas.entity.Counter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class ApiRestController {
    Counter counter = new Counter(540.0);

    @Autowired
    private CityRepository cityRepository;

    public void RestController(CityRepository cityRepository){
        this.cityRepository = cityRepository;
    }

    // Request Mapping pour les villes
    @PostMapping(path = "/city", consumes = "application/json")
    public City saveCity(@RequestBody City city){
        System.out.println("La ville est enregistée");
        return cityRepository.save(city);
    }

    @GetMapping(path = "/city")
    public List<City> getAllCities(){
        System.out.println("Liste de toutes les villes");
        return cityRepository.findAll();
    }

    @GetMapping(path = "/city/{id}")
    public Optional<City> getCityById(@PathVariable Integer id){
        System.out.println("Liste de la ville en fonction de l'id");
        return cityRepository.findById(id);
    }

    @PutMapping(path = "/city/{id}")
    public City changeEtatById(@PathVariable Integer id){
        City city = cityRepository.findById(id).get();
        cityRepository.changeCityState(city);
        cityRepository.save(city);
        return city;
    }

    // Request Mapping pour le compteur
    @GetMapping(path = "/counter")
    public Double getCounter(){
        System.out.println("Obtiens la valeur du compteur");
        return counter.getDistanceKm();
    }

    @PutMapping(path = "/counter/steps")
    public Double updateCounterValueInSteps(@RequestBody Counter updatedCounter) {
        counter.ajouteDistancePas(counter.getValue() + updatedCounter.getValue());
        System.out.println("Ajout steps au compteur");
        return getCounter();
    }
    @PutMapping(path = "/counter/km")
    public Double updateCounterValueInKm(@RequestBody Counter updatedCounter) {
        counter.ajouteDistanceKm(counter.getValue() + updatedCounter.getValue());
        System.out.println("Ajout km au compteur");
        return getCounter();
    }
}
