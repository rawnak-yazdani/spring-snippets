package io.welldev;

import io.welldev.configuration.beans.Accountant;
import io.welldev.configuration.beans.Employee;
import io.welldev.configuration.beans.Manager;
import io.welldev.configuration.ConfigurationMetadata;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext springContainer = new ClassPathXmlApplicationContext("Beans.xml");
        Manager manager = (Manager) springContainer.getBean("manager");

        manager.doWork();
        manager.callMetting();
    }
}