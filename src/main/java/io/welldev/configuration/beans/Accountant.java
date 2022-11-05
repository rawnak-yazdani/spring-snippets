package io.welldev.configuration.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @Component is used to denote a bean/object
 */
//@Component
public class Accountant implements Employee{
//    Employee employee;

    /**
     * @Qualifier is used to denote specific child/implementation of a class/interface
     */
//    public Accountant(@Qualifier("cashieRRR") Employee employee) {
//        this.employee = employee;
//    }

    public void doWork() {
        System.out.println("Auditing Accounts...");
    }
}