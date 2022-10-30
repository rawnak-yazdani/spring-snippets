package io.welldev.configuration.beans;

import org.springframework.stereotype.Component;

/**
 * @Component is used to denote a bean/object
 */
@Component
public class Manager implements Employee{
    public void doWork() {
        System.out.println("Manage the branch office");
    }
}
