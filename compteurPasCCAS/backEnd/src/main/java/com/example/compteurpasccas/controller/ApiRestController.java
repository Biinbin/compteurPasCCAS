package com.example.compteurpasccas.controller;

import com.example.compteurpasccas.dao.CityRepository;
import com.example.compteurpasccas.entity.City;
import com.example.compteurpasccas.entity.Counter;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api")
public class ApiRestController {
    Counter counter = new Counter((float) 0);

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

    @GetMapping(path = "/city/img/{id}")
    public String findImageById(@PathVariable Integer id){
        System.out.println("Obtiens l'url de l'image");
        return cityRepository.findById(id).get().urlImg;
    }

    @GetMapping(path = "/city/info/{id}")
    public String findInfoById(@PathVariable Integer id){
        System.out.println("Obtiens les informations de la ville");
        return cityRepository.findById(id).get().informations;
    }

    @GetMapping(path = "/city/nom/{id}")
    public String findNameById(@PathVariable Integer id){
        System.out.println("Obtiens les informations de la ville");
        return cityRepository.findById(id).get().nom;
    }

    // Request Mapping pour le compteur
    @GetMapping(path = "/counter")
    public JSONObject getCounter(){
        System.out.println("Obtiens la valeur du compteur");
        return counter.getDistanceKm();
    }

    @PutMapping(path = "/counter/steps")
    public Counter updateCounterValueInSteps(@RequestBody Counter updatedCounter) {
        counter.ajouteDistancePas(updatedCounter.getValue());
        System.out.println("Ajout steps au compteur");
        return updatedCounter;
    }
    @PutMapping(path = "/counter/km")
    public Counter updateCounterValueInKm(@RequestBody Counter updatedCounter) {
        counter.ajouteDistanceKm(updatedCounter.getValue());
        System.out.println("Ajout km au compteur");
        return updatedCounter;
    }
}

