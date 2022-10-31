package io.welldev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        /**
         *  AbstractApplicationContext is Spring IoC container, and it is using Beans.xml (configuration metadata)
         *  AbstractApplicationContext Container will create the singleton beans/objects whether springContainer.getBean() is used or not (BeanFactory doesn't follow this)
         *  But it will create prototype beans/objects only when springContainer.getBean() is called.
         */
        AbstractApplicationContext springContainer = new ClassPathXmlApplicationContext("Beans.xml");

        /**
         * Object is created by the spring container and inversion of control is occurring (not DI)
         */
        HelloWorld objA = (HelloWorld) springContainer.getBean("helloWorld");

        objA.getMessage();

//        Resource resource = springContainer.getResource("file:/Users/rawnakyazdani/Desktop/demo.txt");
        Resource resource = springContainer.getResource("demo.txt");
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(resource.getInputStream()));

            while (true) {
                String s = bufferedReader.readLine();
                if (s == null)
                    break;
                System.out.println(s);
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        springContainer.registerShutdownHook();     // it will not work with ApplicationContext
    }
}