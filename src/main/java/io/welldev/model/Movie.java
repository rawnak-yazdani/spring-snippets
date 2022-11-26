package io.welldev.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Movie {
    /**
     * @@Id denotes primary key
     * @@GeneratedValue denotes the strategy to generate primary key
     */
    @Id
    @SequenceGenerator(initialValue=1, name = "project_seq1", sequenceName = "project_seq1", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "project_seq1")
    private Long id;
    private String title;
    @ManyToMany     // Unidirectional
    @JoinTable(name = "movie_genre",
            joinColumns = { @JoinColumn(name = "fk_movie") },
            inverseJoinColumns = { @JoinColumn(name = "fk_genre") })
    @Fetch(value = FetchMode.JOIN)
    private Set<Genre> genres = new HashSet<Genre>();
    @ManyToMany     // Bidirectional
    @JoinTable(name = "movie_actors",
            joinColumns = { @JoinColumn(name = "fk_movie") },
            inverseJoinColumns = { @JoinColumn(name = "fk_actor") })
    @Fetch(value = FetchMode.JOIN)
    private Set<Actor> actors = new HashSet<Actor>();

    @ManyToOne      // Unidirectional
    @JoinColumn(name = "fk_director")
    private Director director;

    @ManyToOne      // Bidirectional
    @JoinColumn(name = "fk_country")
    private Country country;
    private String rating;
    private int year;

    public Movie() {
    }

    public Movie(String title, Set<Genre> genres, String rating, Director director, Set<Actor> actors, int year, Country country) {
        this.title = title;
        this.genres = genres;
        this.rating = rating;
        this.director = director;
        this.actors = actors;
        this.year = year;
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Genre> getGenres() {
        return genres;
    }

    public void setGenres(Set<Genre> genres) {
        this.genres = genres;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Set<Actor> getActors() {
        return actors;
    }

    public void setActors(Set<Actor> actors) {
        this.actors = actors;
    }
}
