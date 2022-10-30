package io.welldev.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @Component is used to denote a bean/object
 */
@Component
public class Manager implements Employee {
    Accountant accountant1;
    Accountant accountant2;
    /**
     * Field dependency injection (It requires @Autowired annotation)
     */
    @Autowired
    Accountant accountant3;
    /**
     * @Qualifier is used to denote specific child/implementation of a class/interface
     */
    @Autowired
    @Qualifier("cashieRRR")
    Employee employee;

    /**
     * Constructor dependency injection (It does not require any annotation)
     */
    public Manager(Accountant accountant) {
        System.out.println("manager constructor");
        this.accountant1 = accountant;
    }

    /**
     * Setter dependency injection (It requires @Autowired annotation)
     */
    @Autowired
    public void setAccountant2(Accountant accountant2) {
        this.accountant2 = accountant2;
    }

    public void doWork() {
        System.out.println("Manage the branch office");
    }

    public void callMetting() {
        System.out.println("\n\nConstructor dependency injection: ");
        accountant1.doWork();

        System.out.println("\n\nSetter dependency injection: ");
        accountant2.doWork();

        System.out.println("\n\nField dependency injection: ");
        accountant3.doWork();

        System.out.println("\n\nField dependency injection with @Qualifier: ");
        employee.doWork();
    }
}
