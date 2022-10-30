package io.welldev.components;

import org.springframework.stereotype.Component;

@Component
public class Accountant implements Employee{
    public void doWork() {
        System.out.println("Auditing Accounts...");
    }
}