package io.welldev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        /**
         * It will invoke all start events of all beans which implements ApplicationListener<ContextStartedEvent>
        */
        context.start();

//        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
//        obj.getMessage();

        context.stop();
        context.registerShutdownHook();     // it will not work with ApplicationContext

    }
}