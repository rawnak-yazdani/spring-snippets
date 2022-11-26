package io.welldev.dao;

import io.welldev.model.Illuminati;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import java.util.List;

@RequiredArgsConstructor
@Component
public class IlluminatiDAOTransactionScoped {

    @PersistenceContext(type = PersistenceContextType.TRANSACTION)
    private EntityManager entityManager;

//    public void setSessionFactory(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }

    //    @Override
    @Transactional
    public void addIlluminati_Transactional(Illuminati illuminati) {
        entityManager.persist(illuminati);
    }

    public void addIlluminati_NonTransactional(Illuminati illuminati) {
//        try{
        entityManager.persist(illuminati);
//        } catch (Exception e){
//            System.out.println(e.toString());
//        }
    }

    //    @Override
    public List<Illuminati> listIlluminati() {
        List<Illuminati> illuminatis = entityManager.createQuery("from Illuminati").getResultList();

        return illuminatis;
    }
}
