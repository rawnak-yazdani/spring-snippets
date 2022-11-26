package io.welldev.model;

import javax.persistence.*;

@Entity
public class Genre {

    @Id
    @SequenceGenerator(initialValue=1, name = "project_seq2", sequenceName = "project_seq2", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "project_seq2")
    private Long id;

    private String name;

    public Genre() {
    }

    public Genre(String name) {
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


}
