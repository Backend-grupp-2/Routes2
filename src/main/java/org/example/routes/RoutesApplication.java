package org.example.routes;

import org.example.routes.model.Route;
import org.example.routes.repository.RouteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RoutesApplication {

    public static void main(String[] args) {
        SpringApplication.run(RoutesApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(RouteRepository repository) {
        return args -> {

            repository.save(new Route("olskroken", "nordstan","car", 11));
            repository.save(new Route("olskroken", "nordstan","bus", 12));
            repository.save(new Route("olskroken", "nordstan","bicycle", 16));

            repository.save(new Route("Hjallbo", "nordstan","Tram", 15));
            repository.save(new Route("Hjallbo", "nordstan","Car", 25));
            repository.save(new Route("Hjallbo", "nordstan","Bus", 25));
            repository.save(new Route("Hjallbo", "nordstan","Bicycle", 36));

            repository.save(new Route("Angered", "nordstan","Bus", 21));
            repository.save(new Route("Angered", "nordstan","Car", 21));
            repository.save(new Route("Angered", "nordstan","Tram", 13));
            repository.save(new Route("Angered", "nordstan","Bicycle", 29));

            repository.save(new Route("Molndal", "Jakobsberg","Car", 14));
            repository.save(new Route("Molndal", "Jakobsberg","Tram", 9));
            repository.save(new Route("Molndal", "Jakobsberg","Bus", 16));
            repository.save(new Route("Molndal", "Jakobsberg","Bicycle", 19));

            repository.save(new Route("Frolunda", "Jakobsberg","Bicycle", 25));
            repository.save(new Route("Frolunda", "Jakobsberg","Car", 17));
            repository.save(new Route("Frolunda", "Jakobsberg","Bus", 21));
            repository.save(new Route("Frolunda", "Jakobsberg","Tram", 15));



        };
    }

}
