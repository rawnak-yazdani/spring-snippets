package io.welldev.dao;

import io.welldev.model.Actor;
import io.welldev.model.Country;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@RequiredArgsConstructor
@Component
@Transactional
public class CountryDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public void add(Country country) {
        entityManager.persist(country);
    }

    public Country get(Long id) {
        return entityManager.find(Country.class, id);
    }

    public void delete(Country country) {
        entityManager.remove(country);
    }

    public List<Country> getAll() {
        List<Country> resultList = entityManager.createQuery("from Country").getResultList();

        return resultList;
    }

    public void update(Country country) {
        entityManager.merge(country);
    }
}
