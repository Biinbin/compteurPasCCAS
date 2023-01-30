package com.example.compteurpasccas.controller;

import com.example.compteurpasccas.dao.CityRepository;
import com.example.compteurpasccas.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class ApiRestController {
    @Autowired
    private CityRepository cityRepository;

    public void RestController(CityRepository cityRepository){
        this.cityRepository = cityRepository;
    }

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
    public List<City> getCityById(@PathVariable Integer id){
        System.out.println("Liste de la ville en fonction de l'id");
        return cityRepository.findById(id);
    }
}
