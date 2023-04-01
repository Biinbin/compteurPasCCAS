package com.example.compteurpasccas;

import com.example.compteurpasccas.dao.CityRepository;
import com.example.compteurpasccas.entity.City;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

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
                "https://thumbs.dreamstime.com/b/tour-eiffel-de-paris-et-rivi%C3%A8re-la-seine-au-coucher-du-soleil-%C3%A0-france-107376702.jpg",
                0);
        cityRepository.save(paris);

        City barcelone = new City("Barcelone",
                "Barcelone, ville espagnole dynamique située sur la côte nord-est de l'Espagne. Attractions culturelles telles que la Sagrada Familia, plages, bars à tapas, marchés animés et vie nocturne vibrante. Ville incontournable pour les touristes du monde entier.",
                 "https://swello.com/fr/blog/wp-content/uploads/2019/11/barcelone-swello.jpg",
                1038);
        cityRepository.save(barcelone);

        City rome = new City("Rome",
                "Rome, ville éternelle italienne, patrimoine historique unique au monde. Colisée, Fontaine de Trevi, cuisine, cafés, rues charmantes. Incontournable pour les passionnés d'histoire et de culture. Des millions de visiteurs chaque année.",
                "https://www.larousse.fr/encyclopedie/data/images/1314730-Rome.jpg",
                2404);
        cityRepository.save(rome);

        City munich = new City("Munich",
                "Munich, en Allemagne, est une ville dynamique et historique. Connue pour son architecture baroque, sa bière et son Oktoberfest annuel, elle abrite également des musées de renommée mondiale, des parcs verdoyants et une scène artistique animée.",
                "https://a.cdn-hotels.com/gdcs/production196/d451/ebc352de-3089-45dc-b2b4-8ed2895b0ed0.jpg",
                3318);
        cityRepository.save(munich);

        City berlin = new City("Berlin",
                "Berlin, capitale de l'Allemagne, mêle histoire mouvementée, culture alternative, vie nocturne animée et riche scène artistique. Monuments historiques, musées, galeries et bars branchés font de Berlin une ville diversifiée et unique.",
                "https://www.okvoyage.com/wp-content/uploads/2015/06/berlin.jpg",
                3903);
        cityRepository.save(berlin);

        City anvers = new City("Anvers",
                "Anvers, ville portuaire belge avec une histoire riche et un centre historique préservé, offre une scène artistique contemporaine, le Musée Plantin-Moretus et des rues commerçantes. La place animée de Grote Markt offre de nombreux restaurants et bars.",
                "https://voyageursintrepides.com/wp-content/uploads/2020/08/shutterstock_1006160776.jpg",
                4625);
        cityRepository.save(anvers);

        City amsterdam  = new City("Amsterdam",
                "Amsterdam, ville des canaux et de l'architecture historique, offre une culture dynamique avec des musées tels que le Van Gogh Museum, des quartiers animés comme Jordaan, ainsi qu'une scène artistique, une cuisine locale et des cafés bruns traditionnels.",
                "https://4tdjltzf4a01.b-cdn.net/w_768,h_436/49fxg4ua8q6r-amsterdam-canals-in-the-city-centre-with-a-beaufitul-sky.jpg",
                4784);
        cityRepository.save(amsterdam);

        City stockholm = new City("Stockholm",
                "Stockholm, capitale de la Suède sur plusieurs îles, est une ville moderne connue pour ses bâtiments historiques, son design scandinave, sa gastronomie et sa vie nocturne. Elle offre également de nombreux musées, parcs et le célèbre prix Nobel",
                "https://media.routard.com/image/79/3/stockholm.1475793.w740.jpg",
                6219);
        cityRepository.save(stockholm);

        City helsinki = new City("Helsinki",
                "Helsinki, capitale de la Finlande, est une ville portuaire moderne et branchée. Elle est reconnue pour son design fonctionnel, sa scène culinaire et son architecture unique. Elle abrite également des musées, des églises et des îles à explorer.",
                "https://media.routard.com/image/97/8/helsinki.1611978.jpg",
                6699);
        cityRepository.save(helsinki);

        City athenes = new City("Athènes",
                "Athènes, capitale de la Grèce, est célèbre pour son histoire et ses sites archéologiques tels que le Parthénon. La ville propose une cuisine savoureuse, des marchés colorés et des musées fascinants, en faisant d'elle une destination incontournable.",
                "https://t.ly/r2fc",
                10088);
        cityRepository.save(athenes);

        City moscou = new City("Moscou",
                "Moscou est une ville emblématique riche en histoire. Elle abrite la place Rouge, le Kremlin et le musée Pouchkine. Centre économique et politique crucial pour la Russie, Moscou joue un rôle important dans la culture et l'histoire du pays.",
                "https://t.ly/Mdae",
                13040);
        cityRepository.save(moscou);

        City pekin = new City("Pékin",
                "Capitale de la Chine, Pékin est riche en histoire et culture, avec des sites célèbres tels que la Cité Interdite et la Grande Muraille. C'est également un centre important pour la technologie et l'innovation.",
                "https://t.ly/L3Uk",
                18830);
        cityRepository.save(pekin);

        City seoul = new City("Séoul",
                "La ville la plus peuplée de Corée du Sud, Séoul est un centre culturel avec une cuisine délicieuse, des festivals animés et une vie nocturne vibrante. Elle est également connue pour sa technologie de pointe et son industrie du divertissement florissante.",
                "https://t.ly/k8IN",
                19782);
        cityRepository.save(seoul);

        City tokyo = new City("Tokyo",
                "Capitale du Japon, Tokyo est une ville animée avec une culture unique, des sites touristiques emblématiques tels que la tour de Tokyo, ainsi qu'une scène culinaire étonnante.",
                "https://t.ly/eske4",
                20941);
        cityRepository.save(tokyo);

        City sydney = new City("Sydney",
                "La plus grande ville d'Australie, Sydney est connue pour ses plages magnifiques, son opéra emblématique et son climat ensoleillé. Elle offre également une riche histoire coloniale et une vie nocturne animée",
                "https://t.ly/IH-l",
                28762);
        cityRepository.save(sydney);

        City melbourne = new City("Melbourne",
                "La deuxième plus grande ville d'Australie, Melbourne est un centre culturel avec une scène artistique et musicale florissante, ainsi que des festivals et événements de renommée mondiale.",
                "https://t.ly/_ZhN",
                29639);
        cityRepository.save(melbourne);

        City rio = new City("Rio de Janeiro",
                "Située au Brésil, Rio de Janeiro est connue pour ses plages emblématiques, sa samba animée et ses festivités carnavalesques. Elle est également un centre de l'industrie cinématographique et de la mode.",
                "https://t.ly/VpwH",
                42841);
        cityRepository.save(rio);

        City mexico = new City("Mexico",
                "Capitale du Mexique, Mexico est une ville historique avec des sites célèbres tels que le Zocalo et la pyramide du Soleil. Elle est également un centre important pour les arts, la culture et la cuisine mexicaine.",
                "https://t.ly/-X81",
                51077);
        cityRepository.save(mexico);

        City losAngeles = new City("Los Angeles",
                "La deuxième plus grande ville des États-Unis, Los Angeles est le centre de l'industrie cinématographique et de la télévision, avec des sites célèbres tels que Hollywood et Beverly Hills.",
                "https://t.ly/Kn8Y",
                54012);
        cityRepository.save(losAngeles);

        City atlanta = new City("Atlanta",
                "La capitale de l'État de Géorgie, Atlanta est un centre important pour les affaires, les arts et la culture afro-américaines, avec des musées et des monuments emblématiques tels que le Martin Luther King Jr. National Historical Park.",
                "https://t.ly/0Bhq",
                57521);
        cityRepository.save(atlanta);

        City saintLouis = new City("Saint Louis",
                "Saint Louis est une ville du Missouri, aux États-Unis, célèbre pour son Gateway Arch et ses musées renommés tels que le Musée d'art de Saint Louis. La ville est un centre culturel important, en particulier pour la musique blues et jazz.",
                "https://t.ly/8Q_j",
                58414);
        cityRepository.save(saintLouis);

        City montreal = new City("Montreal",
                "La deuxième plus grande ville du Canada, Montréal est un centre culturel avec une scène artistique et musicale florissante, ainsi qu'une cuisine renommée. Elle est également un centre de l'industrie du jeu vidéo et de la technologie.",
                "https://t.ly/6_LE",
                60168);
        cityRepository.save(montreal);

        City londres = new City("Londres",
                "La capitale du Royaume-Uni, Londres est une ville historique avec une riche culture et des sites célèbres tels que le palais de Buckingham et la Tour de Londres. Elle est également un centre important pour les affaires, la finance et les arts.",
                "https://t.ly/wdow",
                65385);
        cityRepository.save(londres);

        City paris2 = new City("Paris",
                "Paris, ville emblématique de la France, est célèbre pour ses monuments, sa gastronomie, ses musées et sa mode. Capitale de l'amour, elle est un incontournable de l'Europe avec ses rues pittoresques, ses cafés charmants et sa culture riche",
                "https://t.ly/ew97",
                65727);
        cityRepository.save(paris2);
    }
}
