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
                "https://t.ly/ew97",
                0);
        cityRepository.save(paris);

        City barcelone = new City("Barcelone",
                "Barcelone, ville espagnole dynamique située sur la côte nord-est de l'Espagne. Attractions culturelles telles que la Sagrada Familia, plages, bars à tapas, marchés animés et vie nocturne vibrante. Ville incontournable pour les touristes du monde entier.",
                 "https://t.ly/-GmN",
                1038);
        cityRepository.save(barcelone);

        City rome = new City("Rome",
                "Rome, ville éternelle italienne, patrimoine historique unique au monde. Colisée, Fontaine de Trevi, cuisine, cafés, rues charmantes. Incontournable pour les passionnés d'histoire et de culture. Des millions de visiteurs chaque année.",
                "https://t.ly/dkOQ",
                2404);
        cityRepository.save(rome);

        City munich = new City("Munich",
                "Munich, en Allemagne, est une ville dynamique et historique. Connue pour son architecture baroque, sa bière et son Oktoberfest annuel, elle abrite également des musées de renommée mondiale, des parcs verdoyants et une scène artistique animée.",
                "https://t.ly/dkOQ",
                3318);
        cityRepository.save(munich);

        City berlin = new City("Berlin",
                "Berlin, capitale de l'Allemagne, mêle histoire mouvementée, culture alternative, vie nocturne animée et riche scène artistique. Monuments historiques, musées, galeries et bars branchés font de Berlin une ville diversifiée et unique.",
                "https://t.ly/BXZs",
                3903);
        cityRepository.save(berlin);

        City anvers = new City("Anvers",
                "Anvers, ville portuaire belge avec une histoire riche et un centre historique préservé, offre une scène artistique contemporaine, le Musée Plantin-Moretus et des rues commerçantes. La place animée de Grote Markt offre de nombreux restaurants et bars.",
                "https://t.ly/E_S6",
                4625);
        cityRepository.save(anvers);

        City amsterdam  = new City("Amsterdam",
                "Amsterdam, ville des canaux et de l'architecture historique, offre une culture dynamique avec des musées tels que le Van Gogh Museum, des quartiers animés comme Jordaan, ainsi qu'une scène artistique, une cuisine locale et des cafés bruns traditionnels.",
                "https://t.ly/Y_N8",
                4784);
        cityRepository.save(amsterdam);

        City stockholm = new City("Stockholm",
                "Stockholm, capitale de la Suède sur plusieurs îles, est une ville moderne connue pour ses bâtiments historiques, son design scandinave, sa gastronomie et sa vie nocturne. Elle offre également de nombreux musées, parcs et le célèbre prix Nobel",
                "https://t.ly/OQ_d",
                6219);
        cityRepository.save(stockholm);

        City helsinki = new City("Helsinki",
                "Helsinki, capitale de la Finlande, est une ville portuaire moderne et branchée. Elle est reconnue pour son design fonctionnel, sa scène culinaire et son architecture unique. Elle abrite également des musées, des églises et des îles à explorer.",
                "https://t.ly/8Jvg",
                6699);
        cityRepository.save(helsinki);

        City athenes = new City("Athènes",
                "Athènes, capitale de la Grèce, est célèbre pour son histoire et ses sites archéologiques tels que le Parthénon. La ville propose une cuisine savoureuse, des marchés colorés et des musées fascinants, en faisant d'elle une destination incontournable.",
                "https://t.ly/r2fc",
                10088);
        cityRepository.save(athenes);

        City moscou = new City("Moscou",
                "Informations",
                "https://t.ly/r2fc",
                13040);
        cityRepository.save(moscou);

        City pekin = new City("Pékin",
                "Informations",
                "https://t.ly/r2fc",
                18830);
        cityRepository.save(pekin);

        City seoul = new City("Séoul",
                "Informations",
                "https://t.ly/r2fc",
                19782);
        cityRepository.save(seoul);

        City tokyo = new City("Tokyo",
                "Informations",
                "https://t.ly/r2fc",
                20941);
        cityRepository.save(tokyo);

        City sydney = new City("Sydney",
                "Informations",
                "https://t.ly/r2fc",
                28762);
        cityRepository.save(sydney);

        City melbourne = new City("Melbourne",
                "Informations",
                "https://t.ly/r2fc",
                29639);
        cityRepository.save(melbourne);

        City rio = new City("Rio",
                "Informations",
                "https://t.ly/r2fc",
                42841);
        cityRepository.save(rio);

        City mexico = new City("Mexico",
                "Informations",
                "https://t.ly/r2fc",
                51077);
        cityRepository.save(mexico);

        City losAngeles = new City("Los Angeles",
                "Informations",
                "https://t.ly/r2fc",
                54012);
        cityRepository.save(losAngeles);

        City atlanta = new City("Atlanta",
                "Informations",
                "https://t.ly/r2fc",
                57521);
        cityRepository.save(atlanta);

        City saintLouis = new City("Saint Louis",
                "Informations",
                "https://t.ly/r2fc",
                58414);
        cityRepository.save(saintLouis);

        City montreal = new City("Montreal",
                "Informations",
                "https://t.ly/r2fc",
                60168);
        cityRepository.save(montreal);

        City londres = new City("Londres",
                "Informations",
                "https://t.ly/r2fc",
                65385);
        cityRepository.save(londres);

        City paris2 = new City("Paris",
                "Informations",
                "https://t.ly/r2fc",
                65727);
        cityRepository.save(paris2);
    }
}
