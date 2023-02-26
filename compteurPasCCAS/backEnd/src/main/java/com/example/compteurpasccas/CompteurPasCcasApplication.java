package com.example.compteurpasccas;

import com.example.compteurpasccas.dao.CityRepository;
import com.example.compteurpasccas.entity.City;
import com.example.compteurpasccas.entity.Counter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

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

        City paris = new City("Paris",
                "Paris, ville emblématique de la France, est célèbre pour ses monuments, sa gastronomie, ses musées et sa mode. Capitale de l'amour, elle est un incontournable de l'Europe avec ses rues pittoresques, ses cafés charmants et sa culture riche",
                "https://t.ly/_2Af",
                true,
                0);
        cityRepository.save(paris);

        City barcelone = new City("Barcelone",
                "Barcelone, ville espagnole dynamique située sur la côte nord-est de l'Espagne. Attractions culturelles telles que la Sagrada Familia, plages, bars à tapas, marchés animés et vie nocturne vibrante. Ville incontournable pour les touristes du monde entier.",
                 "https://t.ly/-GmN",
                 false,
                1038);
        cityRepository.save(barcelone);

        City rome = new City("Rome",
                "Rome, ville éternelle italienne, patrimoine historique unique au monde. Colisée, Fontaine de Trevi, cuisine, cafés, rues charmantes. Incontournable pour les passionnés d'histoire et de culture. Des millions de visiteurs chaque année.",
                "https://t.ly/dkOQ",
                false,
                2404);
        cityRepository.save(rome);

        City munich = new City("Munich",
                "Munich, en Allemagne, est une ville dynamique et historique. Connue pour son architecture baroque, sa bière et son Oktoberfest annuel, elle abrite également des musées de renommée mondiale, des parcs verdoyants et une scène artistique animée.",
                "https://t.ly/dkOQ",
                false,
                3318);
        cityRepository.save(munich);

        City berlin = new City("Berlin",
                "Berlin, capitale de l'Allemagne, mêle histoire mouvementée, culture alternative, vie nocturne animée et riche scène artistique. Monuments historiques, musées, galeries et bars branchés font de Berlin une ville diversifiée et unique.",
                "https://t.ly/BXZs",
                false,
                3903);
        cityRepository.save(berlin);

        City anvers = new City("Anvers",
                "Anvers, ville portuaire belge avec une histoire riche et un centre historique préservé, offre une scène artistique contemporaine, le Musée Plantin-Moretus et des rues commerçantes. La place animée de Grote Markt offre de nombreux restaurants et bars.",
                "https://t.ly/E_S6",
                false,
                4625);
        cityRepository.save(anvers);

        City amsterdam  = new City("Amsterdam",
                "Amsterdam, ville des canaux et de l'architecture historique, offre une culture dynamique avec des musées tels que le Van Gogh Museum, des quartiers animés comme Jordaan, ainsi qu'une scène artistique, une cuisine locale et des cafés bruns traditionnels.",
                "https://t.ly/Y_N8",
                false,
                4784);
        cityRepository.save(amsterdam);

        City stockholm = new City("Stockholm",
                "Informations",
                "",
                false,
                6219);
        cityRepository.save(stockholm);

        City helsinki = new City("Helsinki",
                "Informations",
                "",
                false,
                6699);
        cityRepository.save(helsinki);

        City athènes = new City("Athènes",
                "Informations",
                "",
                false,
                10088);
        cityRepository.save(athènes);

        City moscou = new City("Moscou",
                "Informations",
                "",
                false,
                13040);
        cityRepository.save(moscou);

        City pekin = new City("Pékin",
                "Informations",
                "",
                false,
                18830);
        cityRepository.save(pekin);

        City seoul = new City("Séoul",
                "Informations",
                "",
                false,
                19782);
        cityRepository.save(seoul);

        City tokyo = new City("Tokyo",
                "Informations",
                "",
                false,
                20941);
        cityRepository.save(tokyo);

        City sydney = new City("Sydney",
                "Informations",
                "",
                false,
                28762);
        cityRepository.save(sydney);

        City melbourne = new City("Melbourne",
                "Informations",
                "",
                false,
                29639);
        cityRepository.save(melbourne);

        City rio = new City("Rio",
                "Informations",
                "",
                false,
                42841);
        cityRepository.save(rio);

        City mexico = new City("Mexico",
                "Informations",
                "",
                false,
                51077);
        cityRepository.save(mexico);

        City losAngeles = new City("Los Angeles",
                "Informations",
                "",
                false,
                54012);
        cityRepository.save(losAngeles);

        City atlanta = new City("Atlanta",
                "Informations",
                "",
                false,
                57521);
        cityRepository.save(atlanta);

        City saintLouis = new City("Saint Louis",
                "Informations",
                "",
                false,
                58414);
        cityRepository.save(saintLouis);

        City montreal = new City("Montreal",
                "Informations",
                "",
                false,
                60168);
        cityRepository.save(montreal);

        City londres = new City("Londres",
                "Informations",
                "",
                false,
                65385);
        cityRepository.save(londres);

        City paris2 = new City("Paris",
                "Informations",
                "",
                false,
                65727);
        cityRepository.save(paris2);
    }
}
