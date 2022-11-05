package io.welldev.configuration.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
public class Manager implements Employee {
    Accountant accountant1;
    Accountant accountant2;
    public Manager(Accountant accountant1) {
        this.accountant1 = accountant1;
    }
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
    }
}
