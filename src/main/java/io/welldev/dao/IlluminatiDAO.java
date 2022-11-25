package io.welldev.dao;

import io.welldev.model.Illuminati;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@RequiredArgsConstructor
@Component
@Transactional
public class IlluminatiDAO {

    @PersistenceContext
    private EntityManager entityManager;

//    public void setSessionFactory(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }

//    @Override
    public void createIlluminati(Illuminati illuminati) {
        entityManager.persist(illuminati);
    }

//    @Override
    public List<Illuminati> listIlluminati() {
        List<Illuminati> illuminatis = entityManager.createQuery("from Illuminati").getResultList();

        return illuminatis;
    }
}
