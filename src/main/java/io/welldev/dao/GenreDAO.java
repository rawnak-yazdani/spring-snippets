package io.welldev.dao;

import io.welldev.model.Genre;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@RequiredArgsConstructor
@Component
@Transactional
public class GenreDAO {
    @PersistenceContext
    private EntityManager entityManager;

    public void add(Genre genre) {
        entityManager.persist(genre);
    }

    public Genre get(Long id) {
        return entityManager.find(Genre.class, id);
    }

    public void delete(Genre genre) {
        entityManager.remove(genre);
    }

    public List<Genre> getAll() {
        List<Genre> resultList = entityManager.createQuery("from Genre").getResultList();

        return resultList;
    }

    public void update(Genre genre) {
        entityManager.merge(genre);
    }
}
