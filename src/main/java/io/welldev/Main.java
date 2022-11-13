package io.welldev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        /**
         *  AbstractApplicationContext is Spring IoC container, and it is using Beans.xml (configuration metadata)
         *  AbstractApplicationContext Container will create the singleton beans/objects whether springContainer.getBean() is used or not (BeanFactory doesn't follow this)
         *  But it will create prototype beans/objects only when springContainer.getBean() is called.
         */
        AbstractApplicationContext springContainer = new ClassPathXmlApplicationContext("Beans.xml");
//        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        /**
         * Object is created by the spring container and inversion of control is occurring (not DI)
         */
        HelloWorld objA = (HelloWorld) springContainer.getBean("helloWorld");
//        HelloWorld objB = (HelloWorld) context.getBean("helloWorld2");

        objA.getMessage();
//        objB.getMessage();
        springContainer.registerShutdownHook();     // it will not work with ApplicationContext

//        objA.setMessage("I'm Object A");
//        objA.getMessage();
//
//        HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
//        objB.getMessage();




    }
}