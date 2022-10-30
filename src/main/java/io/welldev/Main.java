package io.welldev;

import io.welldev.components.Accountant;
import io.welldev.components.Employee;
import io.welldev.components.Manager;
import io.welldev.configuration.ConfigurationMetadata;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        /**
         *  AnnotationConfigApplicationContext is Spring IoC container, and it is using ConfigurationMetadata (configuration metadata)
         *  AnnotationConfigApplicationContext Container will create the singleton beans/objects whether springContainer.getBean() is used or not (BeanFactory doesn't follow this)
         *  But it will create prototype beans/objects only when springContainer.getBean() is called.
         */
        AnnotationConfigApplicationContext springContainer = new AnnotationConfigApplicationContext(ConfigurationMetadata.class);

        /**
         * Object is created by the spring container and inversion of control is occurring (not DI)
         */
        Employee employee1 = springContainer.getBean(Accountant.class);
        Employee employee2 = springContainer.getBean(Manager.class);

        employee1.doWork();
        employee2.doWork();

        springContainer.close();

    }
}