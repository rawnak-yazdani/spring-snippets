package io.welldev.beans;

import org.springframework.stereotype.Component;

/**
 * @Component is used to denote a bean/object
 * We are giving the object/component/bean name as cashieRRR (by default it is cashier)
 */
@Component("cashieRRR")
public class Cashier implements Employee{
    @Override
    public void doWork() {
        System.out.println("Counting cash...");
    }
}
