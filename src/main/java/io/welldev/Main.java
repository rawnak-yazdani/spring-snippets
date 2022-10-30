package io.welldev;

import io.welldev.beans.HelloWorldBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        /**
         *  ApplicationContext is Spring IoC container, and it is using Beans.xml (configuration metadata)
         *  ApplicationContext Container will create the singleton beans/objects whether springContainer.getBean() is used or not (BeanFactory doesn't follow this)
         *  But it will create prototype beans/objects only when springContainer.getBean() is called.
         */
        ApplicationContext springContainer = new ClassPathXmlApplicationContext("Beans.xml");

        /**
         * Object is created by the spring container and inversion of control is occurring (not DI)
         */
        HelloWorldBean objA = (HelloWorldBean) springContainer.getBean("helloWorld");
        HelloWorldBean objB = (HelloWorldBean) springContainer.getBean("helloWorld2");

        objA.getMessage();
        objB.getMessage();
    }
}