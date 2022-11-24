package io.welldev.model;

import javax.persistence.*;

@Entity
public class Director {
    @Id
    @SequenceGenerator(initialValue=1, name = "project_seq3", sequenceName = "project_seq3", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "project_seq3")
    private Long id;
    private String name;

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
