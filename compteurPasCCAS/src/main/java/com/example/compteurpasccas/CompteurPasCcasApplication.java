package com.example.compteurpasccas;

import com.example.compteurpasccas.dao.CityRepository;
import com.example.compteurpasccas.entity.City;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class CompteurPasCcasApplication implements CommandLineRunner {

    CityRepository cityRepository;

    public CompteurPasCcasApplication(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(CompteurPasCcasApplication.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        City paris = new City("Paris", "Informations", true);
        cityRepository.save(paris);

        City barcelone = new City("Barcelone", "Informations", false);
        cityRepository.save(barcelone);

        City rome = new City("Rome", "Informations", false);
        cityRepository.save(rome);

        City munich = new City("Munich", "Informations", false);
        cityRepository.save(munich);

        City berlin = new City("Berlin", "Informations", false);
        cityRepository.save(berlin);

        City anvers = new City("Anvers", "Informations", false);
        cityRepository.save(anvers);

        City amsterdam  = new City("Amsterdam", "Informations", false);
        cityRepository.save(amsterdam);

        City stockholm = new City("Stockholm", "Informations", false);
        cityRepository.save(stockholm);

        City helsinki = new City("Helsinki", "Informations", false);
        cityRepository.save(helsinki);

        City athènes = new City("Athènes", "Informations", false);
        cityRepository.save(athènes);

        City moscou = new City("Moscou", "Informations", false);
        cityRepository.save(moscou);

        City pekin = new City("Pékin", "Informations", false);
        cityRepository.save(pekin);

        City seoul = new City("Séoul", "Informations", false);
        cityRepository.save(seoul);

        City tokyo = new City("Tokyo", "Informations", false);
        cityRepository.save(tokyo);

        City sydney = new City("Sydney", "Informations", false);
        cityRepository.save(sydney);

        City melbourne = new City("Melbourne", "Informations", false);
        cityRepository.save(melbourne);

        City rio = new City("Rio", "Informations", false);
        cityRepository.save(rio);

        City mexico = new City("Mexico", "Informations", false);
        cityRepository.save(mexico);

        City losAngeles = new City("Los Angeles", "Informations", false);
        cityRepository.save(losAngeles);

        City atlanta = new City("Atlanta", "Informations", false);
        cityRepository.save(atlanta);

        City saintLouis = new City("Saint Louis", "Informations", false);
        cityRepository.save(saintLouis);

        City montreal = new City("Montreal", "Informations", false);
        cityRepository.save(montreal);

        City londres = new City("Londres", "Informations", false);
        cityRepository.save(londres);

    }
}
