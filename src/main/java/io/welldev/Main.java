package io.welldev;

import io.welldev.dao.IlluminatiDAOExtendedScoped;
import io.welldev.dao.IlluminatiDAOTransactionScoped;
import io.welldev.model.Illuminati;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("io.welldev.config");

        IlluminatiDAOTransactionScoped illuminatiDAOTransactionScoped = context.getBean(IlluminatiDAOTransactionScoped.class);
        IlluminatiDAOExtendedScoped illuminatiDAOExtendedScoped = context.getBean(IlluminatiDAOExtendedScoped.class);

//        insertData_TransactionScoped_NonTransactionalMethod(illuminatiDAOTransactionScoped);
//        insertData_TransactionScoped_TransactionalMethod(illuminatiDAOTransactionScoped);

//
//        insertData_ExtendedScoped_NonTransactionalMethod(illuminatiDAOExtendedScoped);
//        insertData_ExtencedScoped_TransactionalMethod(illuminatiDAOExtendedScoped);

        listAllIlluminati(illuminatiDAOTransactionScoped);

    }

    private static void insertData_ExtendedScoped_NonTransactionalMethod(IlluminatiDAOExtendedScoped illuminatiDAO_ExtendedScoped) {
        Illuminati illuminati = new Illuminati();
        illuminati.setName("Mukesh Ambani");
        illuminati.setCountry("India");
        illuminati.setDesignation("ExtendedScoped_NonTransactional");
        illuminati.setBalance(200000000);
        illuminatiDAO_ExtendedScoped.addIlluminati_NonTransactional(illuminati);
//        System.out.println("----------------------------------------------------------");
//        System.out.println(illuminati.getName() + " has joined US!! ");
//        System.out.println("----------------------------------------------------------");
    }

    private static void insertData_ExtencedScoped_TransactionalMethod(IlluminatiDAOExtendedScoped illuminatiDAO_ExtendedScoped) {
        Illuminati illuminati = new Illuminati();
        illuminati.setName("Elon Musk");
        illuminati.setCountry("USA");
        illuminati.setDesignation("ExtencedScoped_Transactional");
        illuminati.setBalance(300000000);
        illuminatiDAO_ExtendedScoped.addIlluminati_Transactional(illuminati);
//        System.out.println("----------------------------------------------------------");
//        System.out.println(illuminati.getName() + " has joined US!! ");
//        System.out.println("----------------------------------------------------------");
    }

    private static void insertData_TransactionScoped_NonTransactionalMethod(IlluminatiDAOTransactionScoped illuminatiDAO_TransactionScoped) {
        Illuminati illuminati = new Illuminati();
        illuminati.setName("Mark Zuckerberg");
        illuminati.setCountry("USA");
        illuminati.setDesignation("TransactionScoped_NonTransactional");
        illuminati.setBalance(300000000);
        illuminatiDAO_TransactionScoped.addIlluminati_NonTransactional(illuminati);
//        System.out.println("----------------------------------------------------------");
//        System.out.println(illuminati.getName() + " has joined US!! ");
//        System.out.println("----------------------------------------------------------");
    }

    public static void insertData_TransactionScoped_TransactionalMethod(IlluminatiDAOTransactionScoped illuminatiDAO_TransactionScoped) {
        Illuminati illuminati = new Illuminati();
        illuminati.setName("Bill Gates");
        illuminati.setCountry("USA");
        illuminati.setDesignation("TransactionScoped_Transactional");
        illuminati.setBalance(300000000);
        illuminatiDAO_TransactionScoped.addIlluminati_Transactional(illuminati);
//        System.out.println("----------------------------------------------------------");
//        System.out.println(illuminati.getName() + " has joined US!! ");
//        System.out.println("----------------------------------------------------------");
    }

    private static void listAllIlluminati(IlluminatiDAOTransactionScoped illuminatiDAOTransactionScoped) {
        List<Illuminati> list = illuminatiDAOTransactionScoped.listIlluminati();

        System.out.println("----------------------------------------------------------");
        System.out.println("All Illuminatis : ");
        for (Illuminati illuminati1 :
                list) {
            System.out.println(illuminati1.getName());
        }
        System.out.println("----------------------------------------------------------");
    }
}
