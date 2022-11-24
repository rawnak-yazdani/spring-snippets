package io.welldev;

import io.welldev.dao.*;
import io.welldev.model.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("io.welldev.config");

        Actor actor1 = new Actor();
        actor1.setName("Ryan Gosling");

        Director director1 = new Director();
        director1.setName("Nicolas Winding Refn");

        Genre genre1 = new Genre();
        genre1.setName("Action");

        Genre genre2 = new Genre();
        genre2.setName("Drama");

        Country country = new Country();
        country.setName("South Korea");

        Movie movie1 = new Movie();
        movie1.setTitle("Drive 12");
        movie1.setYear(2011);
        movie1.getActors().add(actor1);
        movie1.setDirector(director1);
        movie1.getGenres().add(genre1);
        movie1.getGenres().add(genre2);
        movie1.setCountry(country);
        movie1.setRating("M");

        ActorDAO actorDao = context.getBean(ActorDAO.class);
        actorDao.add(actor1);

        DirectorDAO directorDAO = context.getBean(DirectorDAO.class);
        directorDAO.add(director1);

        GenreDAO genreDAO = context.getBean(GenreDAO.class);
        genreDAO.add(genre1);
        genreDAO.add(genre2);

        CountryDAO countryDao = context.getBean(CountryDAO.class);
        countryDao.add(country);

        MovieDAO movieDAO = context.getBean(MovieDAO.class);
        movieDAO.add(movie1);

    }
}
