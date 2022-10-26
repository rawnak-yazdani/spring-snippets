package io.welldev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        /**
         *  AbstractApplicationContext is spring container, and it is using Beans.xml (configuration metadata)
         *  Container will create the singleton beans/objects whether container.getBean() is used or not
         *  But it will create prototype beans/objects only when container.getBean() is called.
         */
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        /**
         * Object is created by the spring container
         */
        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
//        HelloWorld objB = (HelloWorld) context.getBean("helloWorld2");

        objA.getMessage();
//        objB.getMessage();
        context.registerShutdownHook();     // it will not work with ApplicationContext

//        objA.setMessage("I'm Object A");
//        objA.getMessage();
//
//        HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
//        objB.getMessage();
    }
}