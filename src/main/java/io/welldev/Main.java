package io.welldev;

import io.welldev.dao.IlluminatiDAO;
import io.welldev.model.Illuminati;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("io.welldev.config");

        IlluminatiDAO illuminatiDAO = context.getBean(IlluminatiDAO.class);

        insertData(illuminatiDAO);

        listAllIlluminati(illuminatiDAO);

    }

    private static void listAllIlluminati(IlluminatiDAO illuminatiDAO) {
        List<Illuminati> list = illuminatiDAO.listIlluminati();

        System.out.println("----------------------------------------------------------");
        System.out.println("All Illuminatis : ");
        for (Illuminati illuminati1 :
                list) {
            System.out.println(illuminati1.getName());
        }
        System.out.println("----------------------------------------------------------");
    }

    public static void insertData(IlluminatiDAO illuminatiDAO) {
        Illuminati illuminati = new Illuminati();
        illuminati.setName("Bill Gates");
        illuminati.setCountry("USA");
        illuminati.setDesignation("33 Degrees");
        illuminati.setBalance(300000000);
        illuminatiDAO.addIlluminati(illuminati);
        System.out.println("----------------------------------------------------------");
        System.out.println(illuminati.getName() + " has joined US!! ");
        System.out.println("----------------------------------------------------------");
    }
}
