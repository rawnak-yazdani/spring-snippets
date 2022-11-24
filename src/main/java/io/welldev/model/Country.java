package io.welldev.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Country {
    @Id
    @SequenceGenerator(initialValue=1, name = "project_seq5", sequenceName = "project_seq5", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "project_seq5")
    private Long id;
    private String name;
    @OneToMany(mappedBy = "country")
//    @JoinColumn(name = "fk_movie")
    private Set<Movie> movies = new HashSet<Movie>();

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