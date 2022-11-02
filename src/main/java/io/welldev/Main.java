package io.welldev;

import io.welldev.configuration.beans.Accountant;
import io.welldev.configuration.beans.Employee;
import io.welldev.configuration.beans.Manager;
import io.welldev.configuration.ConfigurationMetadata;
import io.welldev.configuration.beans.Waiter;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.validation.DataBinder;

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
//        Employee employee1 = springContainer.getBean(Accountant.class);
//        Employee employee2 = springContainer.getBean(Manager.class);
//        Employee employee3 = springContainer.getBean("accountanTTT", Employee.class);
        Employee employee4 = springContainer.getBean("waiteRRR", Employee.class);

//        employee1.doWork();
//        employee2.doWork();
//        employee3.doWork();
//        employee4.doWork();

        MutablePropertyValues mutablePropertyValues = springContainer.getBean("mutablePropertyValues", MutablePropertyValues.class);
        mutablePropertyValues.add("anInt", "10");

        DataBinder dataBinder = springContainer.getBean("dataBinder", DataBinder.class);
        dataBinder.bind(mutablePropertyValues);

        System.out.println(employee4);
        
        springContainer.close();

    }
}