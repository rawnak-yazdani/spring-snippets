package io.welldev.configuration.beans;

import org.springframework.stereotype.Component;

/**
 * @Component is used to denote a bean/object
 */
@Component("accountanTTT")
public class Accountant implements Employee{
    public void doWork() {
        System.out.println("Auditing Accounts...");
    }
}