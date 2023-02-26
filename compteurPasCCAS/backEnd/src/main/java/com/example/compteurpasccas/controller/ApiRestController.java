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
    public Cities getAllCities(){
        System.out.println("Liste de toutes les villes");
        return new Cities(cityRepository.findAll());
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
    @GetMapping(path = "/city/img/{id}")
    public JSONObject findImageById(@PathVariable Integer id){
        System.out.println("Obtiens l'url de l'image");
        JSONObject json = new JSONObject();
        json.put("url", cityRepository.findById(id).get().urlImg);
        return json;
    }

    @GetMapping(path = "/city/info/{id}")
    public JSONObject findInfoById(@PathVariable Integer id){
        System.out.println("Obtiens les informations de la ville");
        JSONObject json = new JSONObject();
        json.put("informations", cityRepository.findById(id).get().informations);
        return json;
    }

    @GetMapping(path = "/city/nom/{id}")
    public JSONObject findNameById(@PathVariable Integer id){
        System.out.println("Obtiens les informations de la ville");
        JSONObject json = new JSONObject();
        json.put("nom", cityRepository.findById(id).get().nom);
        return json;
    }

    @GetMapping(path = "/city/distanceFrom0/{id}")
    public JSONObject findDistanceById(@PathVariable Integer id){
        System.out.println("Obtiens la distance à partir du début de la ville");
        JSONObject json = new JSONObject();
        json.put("distanceFrom0", cityRepository.findById(id).get().distanceFrom0);
        return json;
    }

    // Request Mapping pour le compteur
    @GetMapping(path = "/counter")
    public JSONObject getCounter(){
        System.out.println("Obtiens la valeur du compteur");
        return counter.getDistanceKm();
    }

    @PutMapping(path = "/counter/steps")
    public JSONObject updateCounterValueInSteps(@RequestBody Counter updatedCounter) {
        counter.ajouteDistancePas(updatedCounter.getValue());
        System.out.println("Ajout steps au compteur");
        return getCounter();
    }
    @PutMapping(path = "/counter/km")
    public JSONObject updateCounterValueInKm(@RequestBody Counter updatedCounter) {
        counter.ajouteDistanceKm(updatedCounter.getValue());
        System.out.println("Ajout km au compteur");
        return getCounter();
    }
}
