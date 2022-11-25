package io.welldev;

import io.welldev.dao.IlluminatiDAO;
import io.welldev.model.Illuminati;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("io.welldev.config");

        Illuminati illuminati = new Illuminati();
        illuminati.setName("Bill Gates 4");
        illuminati.setCountry("USA");
        illuminati.setDesignation("33 Degrees");
        illuminati.setBalance(300000000);

        IlluminatiDAO illuminatiDAO = context.getBean(IlluminatiDAO.class);
//        illuminatiDAO.createIlluminati(illuminati);
        System.out.println(illuminati.getName()+ " has joined US!! ");

        List<Illuminati> list = illuminatiDAO.listIlluminati();
        System.out.println("All Illuminatis : ");

        for (Illuminati illuminati1:
             list) {
            System.out.println(illuminati1.getName());
        }
    }
}
