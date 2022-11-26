package io.welldev.model;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Actor {
    @Id
    @SequenceGenerator(initialValue=1, name = "project_seq4", sequenceName = "project_seq4", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "project_seq4")
    private Long id;
    private String name;
    @ManyToMany(mappedBy = "actors")
    @Fetch(value = FetchMode.JOIN)
    private Set<Movie> movies = new HashSet<Movie>();

    public Actor() {

    }

    public Actor(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }
}
