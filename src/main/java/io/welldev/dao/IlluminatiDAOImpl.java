package io.welldev.dao;

import io.welldev.model.Illuminati;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class IlluminatiDAOImpl implements IlluminatiDAO{

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void createIlluminati(Illuminati illuminati) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(illuminati);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Illuminati> listIlluminati() {
        Session session = this.sessionFactory.openSession();
        List<Illuminati> list = session.createQuery("from Illuminati").list();
        session.close();

        return list;
    }
}
